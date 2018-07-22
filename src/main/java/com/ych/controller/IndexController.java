package com.ych.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class IndexController {
    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}
