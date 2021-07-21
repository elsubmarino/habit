package com.habit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HabitController {

    @RequestMapping("/habit")
    public String habitMain(Model model){
        model.addAttribute("url","/assets/habit.js");
        return "index";
    }

}
