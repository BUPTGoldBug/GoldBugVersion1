package com.debugger.controller;

import org.apache.catalina.User;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
@RequestMapping("/")
public class MainController {

    @RequestMapping("getUser")
    public User getUser(){

    return  null;

    }

}
