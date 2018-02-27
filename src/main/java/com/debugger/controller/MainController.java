package com.debugger.controller;

import com.debugger.pojo.UserListPojo;
import com.debugger.service.UserService;


import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class MainController {
    @Autowired
    private UserService userServiceImp;


    @RequestMapping("getUser")
    @ResponseBody
    public com.debugger.pojo.User getUser(@RequestBody com.debugger.pojo.User user,HttpServletRequest httpServletRequest){
        com.debugger.pojo.User user1;
        user1=userServiceImp.getUser(user.getUid());
        if(user1!=null){
            return user1;

        }else {
            return new com.debugger.pojo.User();

        }

    }

    @RequestMapping("getPeopleList")
    @ResponseBody
    public com.debugger.pojo.UserListPojo getUserList(@RequestParam(value = "userName") String userName, HttpServletRequest httpServletRequest){

        UserListPojo userListPojo=userServiceImp.getUserList(userName);
        return  userListPojo;

    }
    @RequestMapping("getPeopleDetail")
    @ResponseBody
    public com.debugger.pojo.User getUserDetail(@RequestParam(value = "userName") String uid, HttpServletRequest httpServletRequest){
        com.debugger.pojo.User user1;
        user1=userServiceImp.getUserDetail(uid);
        if(user1!=null){
            return user1;

        }else {
            return new com.debugger.pojo.User();

        }

    }
}
