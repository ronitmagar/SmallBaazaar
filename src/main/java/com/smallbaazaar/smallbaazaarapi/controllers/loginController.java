package com.smallbaazaar.smallbaazaarapi.controllers;

import com.smallbaazaar.smallbaazaarapi.entities.User;
import com.smallbaazaar.smallbaazaarapi.services.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class loginController {
    @Autowired
    loginService service;

    @GetMapping("login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        List<User> ref = service.getUser(username, password);
        System.out.println(ref);
        if (!ref.isEmpty()) {
            return "login.html";
        }
        return "/";
    }

    @GetMapping("/register")
    public String register(@RequestParam("username") String username, @RequestParam("password") String password)
    {
        User user=new User(username,password);
        service.saveUser(user);
        return "registered!!!";
    }



}
