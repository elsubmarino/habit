package com.habit.controller;

import com.habit.domain.Label;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/label/")
public class LabelController {
    @RequestMapping("add")
    public Label add(@RequestBody Label label){

    }

}
