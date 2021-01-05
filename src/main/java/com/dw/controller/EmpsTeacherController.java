package com.dw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpsTeacherController {
    @RequestMapping("/teacher")
    public String toteacher(Model model){
        model.addAttribute("currentPage","emps.jsp");
        return "jsp/empsTeacher";
    }

}
