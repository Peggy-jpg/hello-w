package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/thyme")
public class thymeleafController {
    @Autowired
    private UserService userService;

    @RequestMapping("/demo1")
    public String demo1() {
        System.out.println("demo1");
        return "thymeleaf/demo1";
    }
}
}
@RequestMapping("/demo3")
public String demo3(HttpServletRequest request, Model model){
    String name = "张三";
    int age = 18;
    String content ="百度";
    model.addAttribute("name", name);
    model.addAttribute("age", age);
    request.setAttribute("content", content);
    return "demo3";
}

