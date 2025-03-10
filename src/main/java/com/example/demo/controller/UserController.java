package com.example.demo.controller;

import com.example.demo.pojo.dto.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user01")
public class UserController {
    @Autowired
    private UserService userService;
   @RequestMapping("/getUserById")
    public User getUserById(@RequestParam("id") int id) {
       User user = userService.getUserById(id);
       return user;
        }
   }

