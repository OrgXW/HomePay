package com.orgxw.hp_core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
