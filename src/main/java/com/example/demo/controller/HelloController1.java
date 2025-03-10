package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController1 {
    @RequestMapping
    @ResponseBody
    public String index() {
        return "index.html";
    }
}
