package com.dw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpsStudentController {
    @RequestMapping("/student")
    public String tostudent(Model model){
        model.addAttribute("currentPage","emps.jsp");
        return "jsp/empsStudent";
    }

}
