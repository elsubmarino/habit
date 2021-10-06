package com.habit.controller;

import com.habit.domain.Habit;
import com.habit.domain.Label;
import com.habit.domain.Login;
import com.habit.service.LabelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/label/")
public class LabelController {
    @Resource(name="labelService")
    LabelService labelService;

    @RequestMapping("add")
    public @ResponseBody Label add(HttpServletRequest request, @RequestBody Label label){
        Login login = (Login)request.getSession().getAttribute("login");
        label.setLogin(login);
        return labelService.add(label);
    }

    @PostMapping("listAll")
    public @ResponseBody
    List<Label> listAll(HttpServletRequest request){
        Login login = (Login)request.getSession().getAttribute("login");
        Label label = new Label();
        label.setLogin(login);
        return labelService.listAll(label);
    }

}
