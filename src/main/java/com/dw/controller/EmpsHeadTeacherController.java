package com.dw.controller;

import com.dw.pojo.MaClass;
import com.dw.pojo.Stuattendance;
import com.dw.service.MaClass.MaClassService;
import com.dw.service.Stuattendance.StuattendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpsHeadTeacherController {
    @Autowired
    MaClassService maClassService;
    @Autowired
    StuattendanceService stuattendanceService;
    @RequestMapping("/headteacher")
    public String toeheadteacher(Model model){
        List<MaClass> maClassList = maClassService.getMaClassList();
        model.addAttribute("classList",maClassList);
        model.addAttribute("currentPage","emps.jsp");
        return "jsp/empsHeadTeacher";
    }
    @RequestMapping("/Teacher.do")
    public String teacherDo(String classname ,Model model){
        List<MaClass> maClassList = maClassService.getMaClassList();
        model.addAttribute("classList",maClassList);
        List<Stuattendance> stuattendanceByclassId = stuattendanceService.getStuattendanceByclassId(classname);
        model.addAttribute("classAttendance",stuattendanceByclassId);
        model.addAttribute("currentPage","emps.jsp");
        return "jsp/empsHeadTeacher";
    }

}
