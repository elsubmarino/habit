package com.habit.controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.habit.domain.Folder;
import com.habit.domain.Habit;
import com.habit.domain.Login;
import com.habit.service.HabitService;
import com.habit.util.PageMaker;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/habit/")
public class HabitController {

    @Resource(name="habitService")
    HabitService habitService;

    @PostMapping(value="list/{number}")
    public @ResponseBody
    PageMaker list(HttpServletRequest request, @PathVariable(name = "number",required = false) int number) throws JsonProcessingException {
        Login login = (Login)request.getSession().getAttribute("login");
        Habit habit = new Habit();
        habit.setLogin(login);
        Page<Habit> list = habitService.getList(habit,number);
        PageMaker pageMaker = new PageMaker(list);
        System.out.println("112222211");
        return pageMaker;
    }

    @PostMapping("create")
    public Habit create(@RequestBody Habit habit, HttpServletRequest request){
        HttpSession session = request.getSession();
        Login login = (Login)session.getAttribute("login");
        habit.setLogin(login);
        return habitService.create(habit);
    }

    @PostMapping("delete/{id}")
    public ResponseEntity<HttpStatus> delete(@RequestBody Habit habit, HttpServletRequest request, @PathVariable("id") Long id){
        HttpSession session = request.getSession();
        Login login = (Login)session.getAttribute("login");
        habit.setId(id);
        habitService.delete(habit);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("modify/{id}")
    public ResponseEntity<HttpStatus> modify(@RequestBody final Habit habit, HttpServletRequest request, @PathVariable("id") Long id){
        HttpSession session = request.getSession();
        Login login = (Login)session.getAttribute("login");
        habit.setId(id);
        habitService.modify(habit);
        return new ResponseEntity<>(HttpStatus.OK);
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
