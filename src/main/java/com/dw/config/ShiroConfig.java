package com.dw.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean bean=new ShiroFilterFactoryBean();
        bean.setSecurityManager(securityManager);
        Map<String,String> filterMap = new LinkedHashMap<>();
        /*
        * shiro内置过滤器
        * anon：无需认证即可访问
        * authc：必须认证才能访问
        * user：必须拥有记住我功能才能用
        * perms：拥有对某个资源的权限才能访问
        * roles：拥有对某个角色的权限才能访问
        *
        * */
        //filterMap.put("/user/add","authc");
        //filterMap.put("/user/update","authc");
        //filterMap.put("/user/add","perms[user:add]");
        //filterMap.put("/user/update","perms[user:update]");
        bean.setFilterChainDefinitionMap(filterMap);
        bean.setLoginUrl("/toLogin");
        bean.setUnauthorizedUrl("/noauth");

        return bean;
    }
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm);
        DefaultWebSessionManager defaultWebSessionManager=new DefaultWebSessionManager();
        defaultWebSessionManager.setSessionIdUrlRewritingEnabled(false);
        securityManager.setSessionManager(defaultWebSessionManager);
        return securityManager;
    }
    @Bean
    public UserRealm userRealm(){

        return new UserRealm();
    }
    @Bean
    public ShiroDialect getShiroDialect(){
        return new ShiroDialect();
    }
}
