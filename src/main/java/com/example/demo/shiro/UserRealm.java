package com.example.demo.shiro;

import com.example.demo.entity.SysUser;
import com.example.demo.service.impl.SysUserServiceimpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.SubjectContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ProjectName: demo1030
 * @Package: com.example.demo.shiro
 * @ClassName: UserRealm
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/10/30 10:21
 * @Version: 1.0
 */
public class UserRealm  extends AuthorizingRealm {
    @Autowired
    SysUserServiceimpl sysUserServiceimpl;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection args) {
        System.out.println( "执行授权" );
        // 声明一个主题和用户
        Subject subject=SecurityUtils.getSubject();
        //获得前台传递的信息,赋值给user
        SysUser user=(SysUser) subject.getPrincipal();
        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo(  );
        //获得登录名字 一般是获得权限角色
        simpleAuthorizationInfo.addStringPermission( user.getLoginName() );
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken args) throws AuthenticationException {
        System.out.println( "认证,登录是不是合法的" );
        UsernamePasswordToken user=(UsernamePasswordToken) args;
        // 声明的一个类型
        SysUser sysUser=new SysUser();
        sysUser.setLoginName( user.getUsername() );
        sysUser.setPassword( String.copyValueOf( user.getPassword() ) );
        // 通过sysuser查询
        SysUser newUser=sysUserServiceimpl.selectOne( sysUser );

        if (newUser==null)
        {
            return null;
        }

        return new SimpleAuthenticationInfo( newUser,newUser.getPassword(),"" );

    }
}
