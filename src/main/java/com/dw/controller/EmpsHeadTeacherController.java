package com.dw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpsHeadTeacherController {
    @RequestMapping("/headteacher")
    public String toeheadteacher(Model model){
        model.addAttribute("currentPage","emps.jsp");
        return "jsp/empsHeadTeacher";
    }

}
