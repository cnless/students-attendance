package com.dw.config;


import com.dw.pojo.MaUser;
import com.dw.service.MaUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {
    @Autowired
    MaUserService maUserService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了=》授权doGetAuthorizationInfo");
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        Subject subject= SecurityUtils.getSubject();
        MaUser currentUser=(MaUser) subject.getPrincipal();
        //info.addStringPermission(currentUser.getPerms());

        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行了=》认证doGetAuthenticationInfo");

        UsernamePasswordToken userToken= (UsernamePasswordToken)authenticationToken;
        MaUser user=maUserService.queryMaUserById(userToken.getUsername());
        if(user==null){
            return null;//抛出异常UnknownAccountException
        }
        Subject currentSubject=SecurityUtils.getSubject();
        Session session=currentSubject.getSession();
        session.setAttribute("loginUser",user);
        //密码认证shiro来做
        return new SimpleAuthenticationInfo(user,user.getPasswd(),"");
    }
}
