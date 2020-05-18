/*
 * @Author: your name
 * @Date: 2020-05-18 18:45:27
 * @LastEditTime: 2020-05-18 20:19:56
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /spring_shiro_log_jiekou/src/main/java/com/example/demo/controller/loginController.java
 */ 
package com.example.demo.controller;

import com.example.demo.entity.SysUser;
import com.example.demo.service.impl.SysUserServiceimpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: demo1030
 * @Package: com.example.demo.controller
 * @ClassName: loginController
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/10/31 15:43
 * @Version: 1.0
 */
@Controller
public class loginController {

    @Autowired
    SysUserServiceimpl sysUserServiceimpl;

    // @RequestMapping("/")
    @RequestMapping("/")
    public String index(){

        return "login1";
    }
    @RequestMapping("login1")
    public String index1(){

        return "login1";
    }
    
    @RequestMapping("/tologin")
    public String selectOne(SysUser user, ModelMap map) {

        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken usertoken=new UsernamePasswordToken( user.getLoginName(),user.getPassword() );

        try {
            subject.login( usertoken );
            return "redirect:/list";
        } catch (UnknownAccountException e) {
            map.addAttribute( "msg","用户名字不存在密码错误" );
            return "login1";

        }catch (IncorrectCredentialsException e)
        {
            map.addAttribute( "msg","密码错误" );
            return "login1";
        }
    }
}
