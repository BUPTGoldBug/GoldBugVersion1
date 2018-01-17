package com.debugger.controller;

import com.debugger.service.UserService;


import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class MainController {
    @Autowired
    private UserService userServiceImp;


    @RequestMapping("getUser")
    @ResponseBody
    public com.debugger.pojo.User getUser(@RequestBody com.debugger.pojo.User user,HttpServletRequest httpServletRequest){
        com.debugger.pojo.User user1;
        user1=userServiceImp.getUser(user.getUserId());
        if(user1!=null){
            return user1;

        }else {
            return new com.debugger.pojo.User();

        }



    }

}
