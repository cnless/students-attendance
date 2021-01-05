package com.dw.controller;

import com.dw.pojo.MaUser;
import com.dw.service.MaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MainController {
    @Autowired
    MaUserService maUserService;
    @PostMapping("/updateUser")
    public String updateU(MaUser maUser, Model model){
        int rs=maUserService.updateMaUser(maUser);
        String ludt=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        model.addAttribute("ludt",ludt);
        if(rs>=1){
            model.addAttribute("msg","更新成功");
        }else {
            model.addAttribute("msg","更新失败");
        }
        return "jsp/main";
    }
}
