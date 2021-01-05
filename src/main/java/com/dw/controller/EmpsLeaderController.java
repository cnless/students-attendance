package com.dw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpsLeaderController {
    @RequestMapping("/leader")
    public String toleader(Model model){
        model.addAttribute("currentPage","emps.jsp");
        return "jsp/empsLeader";
    }

}
