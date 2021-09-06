package com.habit.controller;


import com.habit.domain.Folder;
import com.habit.domain.Login;
import com.habit.service.FolderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class FolderController {
    @Resource(name="folderService")
    FolderService folderService;

    @PostMapping("/folder/create")
    public Folder create(@RequestBody Folder folder, HttpServletRequest request){
        HttpSession session = request.getSession();
        Login login = (Login)session.getAttribute("login");
        folder.setLoginId(login);
        return folderService.create(folder);
    }

    @PostMapping("/folder/list")
    public List<Folder> list(HttpServletRequest request){
        HttpSession session = request.getSession();
        Login login = (Login)session.getAttribute("login");
        Folder folder = new Folder();
        folder.setLoginId(login);
        return folderService.list(folder);
    }

    @PostMapping("folder/delete/{id}")
    public ResponseEntity<HttpStatus> delete(@RequestBody Folder folder, HttpServletRequest request, @PathVariable("id") Long id){
        HttpSession session = request.getSession();
        Login login = (Login)session.getAttribute("login");
        folder.setId(id);
        folderService.delete(folder);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
