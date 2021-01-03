package com.dw.controller;

import com.dw.pojo.MaUser;
import com.dw.service.MaUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "index";
    }
    @RequestMapping("/login")
    public String login(String username,String password,Model model) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {

            subject.login(token);
            double[] t={123,343244,53,345,332};
            model.addAttribute("t",t);
            return "main";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg","用户名不存在");
            return "index";
        }catch (IncorrectCredentialsException e) {
            model.addAttribute("msg","密码错误");
            return "index";
        }
    }
    @RequestMapping("/noauth")
    @ResponseBody
    public String unauthorized(){
        return "未经授权无法访问";
    }
    @GetMapping("/show")
    public String hello(Model model, String name){
        model.addAttribute("name",name);
        return "jsp/show";
    }
}
