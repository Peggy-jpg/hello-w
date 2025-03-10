package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @restcontroller相当于@controller和@ResponseBody的结合体，可以返回json数据
 */
@RestController
public class IndexRestController {
    @RequestMapping("/indexRest")
    public String indexRest() {
        return "index.html";
    }
}
