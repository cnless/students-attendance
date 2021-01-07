package com.dw.controller;

import com.dw.pojo.Attendance;
import com.dw.pojo.MaClass;
import com.dw.pojo.Stuattendance;
import com.dw.service.MaClass.MaClassService;
import com.dw.service.Stuattendance.StuattendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class EmpsLeaderController {
    @Autowired
    MaClassService maClassService;
    @Autowired
    StuattendanceService stuattendanceService;


    @RequestMapping("/leader")
    public String toleader(Model model){
        List<MaClass> maClassList = maClassService.getMaClassList();
        Attendance classAttendance = stuattendanceService.getClassAttendance();
        String[] data=new String[maClassList.size()];
        for (int i = 0; i < maClassList.size(); i++) {
            data[i]="\""+maClassList.get(i).getClassName()+"\"";
        }
        model.addAttribute("attendance",classAttendance);
        model.addAttribute("className",data);
        model.addAttribute("currentPage","emps.jsp");
        return "jsp/empsLeader";
    }

}
