package com.example.demo.shiro;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: demo1030
 * @Package: com.example.demo.shiro
 * @ClassName: ShiroConfig
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/10/30 14:16
 * @Version: 1.0
 */
@Configuration
public class ShiroConfig {


    @Bean(name="shiroFilterFactoryBean")
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager)
    {
        //获得工厂bean
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        // 放置默认安全管理器
        shiroFilterFactoryBean.setSecurityManager( defaultWebSecurityManager );
        Map<String,String> fMap=new HashMap<String, String>(  );
        // 放置到map 集合里
        fMap.put( "/list","authc" );

        // 定义登录页面的地址
        shiroFilterFactoryBean.setLoginUrl( "/login1" );
        shiroFilterFactoryBean.setUnauthorizedUrl( "/permission" );
        shiroFilterFactoryBean.setFilterChainDefinitionMap( fMap );

        return shiroFilterFactoryBean;

    }


    // 默认安全管理器

    @Bean(name="defaultWebSecurityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm")UserRealm userRealm)
    {
        DefaultWebSecurityManager defaultWebSecurityManager=new DefaultWebSecurityManager(  );
        //把安全场所放置到安全管理器里
        defaultWebSecurityManager.setRealm( userRealm );
        return defaultWebSecurityManager;
    }


    // 创建一个realm 安全场所
    @Bean(name="userRealm")
    public UserRealm getRealm(){

        return new UserRealm();
    }
}
