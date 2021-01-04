package com.dw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SMController {
    @RequestMapping("/sm")
    public String toSM(Model model){
        model.addAttribute("currentPage","system-mannager.jsp");
        return "jsp/system-mannager";
    }
}
