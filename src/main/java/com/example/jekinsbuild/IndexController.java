package com.example.jekinsbuild;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/")
@RestController
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "hello world at " + new Date().toString();
    }
}
