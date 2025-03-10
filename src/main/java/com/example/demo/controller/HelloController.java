package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 使得每一个请求都返回一个视图页面
 */
@Controller
@ResponseBody
public class HelloController {
    @RequestMapping("/index")
    public String index() {
        return "index.html";
    }
}
