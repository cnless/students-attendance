package com.dw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class EmpsController {
    @RequestMapping("/emps")
    public String toemps(Model model){
        model.addAttribute("currentPage","emps.jsp");
        return "jsp/emps";
    }

}
