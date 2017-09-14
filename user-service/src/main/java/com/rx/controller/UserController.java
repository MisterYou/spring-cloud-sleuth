package com.rx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by youjin on 2017/9/14.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/hi")
    public String hi(){
        return "I'm forezp";
    }
}
