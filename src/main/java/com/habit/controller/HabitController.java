package com.habit.controller;

import com.habit.domain.Folder;
import com.habit.domain.Habit;
import com.habit.domain.Login;
import com.habit.service.HabitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class HabitController {

    @Resource(name="habitService")
    HabitService habitService;

    @PostMapping(value="list")
    public List<Habit> list(HttpServletRequest request){
        Login login = (Login)request.getSession().getAttribute("login");
        Habit habit = new Habit();
        habit.setLogin(login);
        return habitService.getList(habit);
    }


//    @PostMapping("/add")
//    public ResponseEntity<List<Folder>> add(@PathVariable("contents") String contents){
//        return new ResponseEntity
//    }


//    @PostMapping("/habit/add/{contents}")
//    public ResponseEntity<HttpStatus> add(@PathVariable("contents") String contents){
//
//    }

}
