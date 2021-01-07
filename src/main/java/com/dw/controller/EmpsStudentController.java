package com.dw.controller;

import com.dw.pojo.MaRole;
import com.dw.pojo.Stuattendance;
import com.dw.service.MaRole.MaRoleService;
import com.dw.service.Stuattendance.StuattendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EmpsStudentController {
    @Autowired
    MaRoleService maRoleService;
    @Autowired
    StuattendanceService stuattendanceService;
    @RequestMapping("/student")
    public String tostudent(Model model){
        model.addAttribute("currentPage","emps.jsp");
        return "jsp/empsStudent";
    }
    @RequestMapping("/studentGet")
    public String getStudent(String UserId,Model model){
        if (UserId!=null&&!UserId.equals("")){
            List<Stuattendance> stuattendanceByUserId = stuattendanceService.getStuattendanceByUserId(UserId);
            model.addAttribute("student",stuattendanceByUserId);
            model.addAttribute("msg","查询成功");
        }else {
            model.addAttribute("msg","请输入学号");
        }
        model.addAttribute("currentPage","emps.jsp");
        return "jsp/empsStudent";
    }

}
