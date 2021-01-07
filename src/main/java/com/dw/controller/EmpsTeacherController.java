package com.dw.controller;

import com.dw.pojo.Stuattendance;
import com.dw.service.Stuattendance.StuattendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpsTeacherController {
    @Autowired
    StuattendanceService stuattendanceService;
    @RequestMapping("/teacher")
    public String toteacher(Model model){
        model.addAttribute("currentPage","emps.jsp");
        return "jsp/empsTeacher";
    }
    @RequestMapping("/teacherIn")
    public String teacherIn(Stuattendance stu, Model model){
        try{
            boolean b = stuattendanceService.addStuattendancele(stu);
            if(b==true){
                model.addAttribute("msg","学生信息录入成功");
            }else {
                model.addAttribute("msg","录入失败");
            }
            model.addAttribute("currentPage","emps.jsp");
            return "jsp/empsTeacher";
        }catch (Exception e){
            model.addAttribute("msg","请输入信息");
            model.addAttribute("currentPage","emps.jsp");
            return "jsp/empsTeacher";
        }

    }

}
