package com.habit.controller;

import com.habit.domain.Login;
import com.habit.service.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Resource(name="loginService")
    private LoginService loginService;

//    @GetMapping("/login")
//    public String login(Model model){
//        model.addAttribute("url","/assets/login.js");
//        return "index";
//    }

    @PostMapping("/loginProgress")
    public ResponseEntity<Login> loginProgress(@RequestBody Login login, HttpServletRequest request){
        System.out.println("11zzzAfffdfsadf");
        login.setUseYn('Y');
        Login returned = loginService.getLoginInformation(login);
        if(returned != null) {
            returned.setPassword(null);
            request.setAttribute("login", returned);
            return new ResponseEntity<Login>(returned, HttpStatus.OK);
        }
        return new ResponseEntity<Login>(returned, HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/register")
    public ResponseEntity<Login> register(Login login, HttpServletRequest request){
        login.setUseYn('Y');
        Login returned = loginService.register(login);
        return new ResponseEntity<Login>(returned, HttpStatus.OK);
    }

//    @GetMapping("/register")
//    public String register(Model model){
//        model.addAttribute("url","/assets/register.js");
//        return "index";
//    }
//

}
