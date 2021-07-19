package com.habit.controller;

import com.habit.domain.Login;
import com.habit.service.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {
    @Resource(name="loginService")
    private LoginService loginService;

    @PostMapping("/login")
        public ResponseEntity<Login> login(Login login, HttpServletRequest request){
        Login returned = loginService.getLoginInformation(login);
        if(returned != null) {
            returned.setPassword(null);
            request.setAttribute("login", returned);
        }
        return new ResponseEntity<Login>(returned, HttpStatus.OK);
    }
}
