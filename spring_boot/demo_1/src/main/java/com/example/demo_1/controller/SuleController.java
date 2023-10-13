package com.example.demo_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SuleController
{
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/page2")
    public String page2(){
        return "page2";
    }
}
