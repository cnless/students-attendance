package com.dw.controller;

import com.dw.pojo.MaUser;
import com.dw.pojo.MaUserRole;
import com.dw.service.MaUserRole.MaUserRoleService;
import com.dw.service.MaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.HttpJspPage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class SMController {
    @Autowired
    MaUserService maUserService;
    @Autowired
    MaUserRoleService maUserRoleService;
    @RequestMapping("/sm")
    public String toSM(Model model){
        model.addAttribute("currentPage","system-mannager.jsp");
        return "jsp/system-mannager";
    }
    @RequestMapping("/crole")
    public String toCRole(Model model){
        List<MaUser> maUserList=maUserService.queryMaUserList();
        model.addAttribute("currentPage","system-mannager.jsp");
        int length=maUserList.size()-1;
        model.addAttribute("maUsers",maUserList);
        model.addAttribute("length",length);
        return "jsp/chooseRole";
    }
    @RequestMapping("/setrole/{maUserId}/{roleId}")
    public String setRole(@PathVariable("maUserId") String maUserId, @PathVariable("roleId") String roleId,Model model, HttpSession session){
        MaUserRole maUserRole=new MaUserRole(maUserId,roleId);
        model.addAttribute("currentPage","system-mannager.jsp");
        boolean flag = maUserRoleService.updateMaUserRoleById(maUserRole);
        if(flag){
            session.setAttribute("rmsg","修改成功");
        }else {
            session.setAttribute("rmsg","修改失败");
        }
        return "redirect:/crole";
    }
    @RequestMapping("/um")
    public String UserMannager(Model model){
        List<MaUser> maUserList=maUserService.queryMaUserList();
        model.addAttribute("currentPage","system-mannager.jsp");
        int length=maUserList.size()-1;
        model.addAttribute("maUsers",maUserList);
        model.addAttribute("length",length);
        return "jsp/userMannager";
    }
    @RequestMapping("/udu/{userId}")
    public String Udu(@PathVariable("userId") String userId,Model model){
        model.addAttribute("currentPage","system-mannager.jsp");
        MaUser maUser=maUserService.queryMaUserById(userId);
        model.addAttribute("maUser",maUser);
        return "jsp/updateUser";
    }
    @PostMapping("/updateUser2")
    public String updateU(MaUser maUser, Model model,HttpSession session){
        String ludt=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        model.addAttribute("ludt",ludt);
        maUser.setLastUpdateDt(ludt);
        int rs=maUserService.updateMaUser(maUser);
        if(rs>=1){
            session.setAttribute("umsg","更新成功");
        }else {
            session.setAttribute("umsg","更新失败");
        }
        return "redirect:/udu/"+maUser.getUserId();
    }

}
