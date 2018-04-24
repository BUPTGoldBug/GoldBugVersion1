package com.debugger.controller;


import com.alibaba.fastjson.JSONObject;
import com.debugger.model.UserListPojo;
import com.debugger.pojo.*;
import com.debugger.service.BugService;
import com.debugger.service.UserService;


import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/goldbug")
public class MainController {
    @Autowired
    private UserService userServiceImp;


    @Autowired
    private BugService bugServiceImp;

    @RequestMapping("/getUser")
    @ResponseBody
    public com.debugger.model.User getUser(@RequestBody com.debugger.model.User user, HttpServletRequest httpServletRequest){
        com.debugger.model.User user1;
        user1=userServiceImp.getUser(user.getUid());
        if(user1!=null){
            return user1;

        }else {
            return new com.debugger.model.User();

        }

    }

    @RequestMapping("/getPeopleList")
    @ResponseBody
    public com.debugger.model.UserListPojo getUserList(@RequestParam(value = "userName") String userName, HttpServletRequest httpServletRequest){

        UserListPojo userListPojo=userServiceImp.getUserList(userName);
        return  userListPojo;

    }
    @RequestMapping("/getPeopleDetail")
    @ResponseBody
    public com.debugger.model.User getUserDetail(@RequestParam(value = "userName") String uid, HttpServletRequest httpServletRequest){
        com.debugger.model.User user1;
        user1=userServiceImp.getUserDetail(uid);
        if(user1!=null){
            return user1;

        }else {
            return new com.debugger.model.User();

        }

    }



    @RequestMapping(value = "testPost",method = {RequestMethod.GET,RequestMethod.POST})
    public String testPost(@RequestParam(value = "mailAddress") String mailAddress, HttpServletRequest httpServletRequest){

        return mailAddress+"_getted!";

    }
    @RequestMapping("sendMail")
    public String sendMail(@RequestParam(value = "mailAddress") String mailAddress, HttpServletRequest httpServletRequest){

        return userServiceImp.sendEmail(mailAddress);

    }
    @RequestMapping("/getAroundBugs")
    public @ResponseBody
    List<BugBasic> getAroundBugs(@RequestBody Coordinate userTmp){

        List<BugBasic> bugList =bugServiceImp.getBugs(userTmp);
        return bugList;
    }
    @RequestMapping("/addGoldBug") //@RequestBody BugInfo bugInfo, @RequestBody Content content
    public @ResponseBody
    Result addNewGoldbug(@RequestBody BugContent bugContent){
    try {
        Result result =  bugServiceImp.inserBug(bugContent);
        return result;
    }catch (Exception e){
        e.printStackTrace();

        Result result =new Result();
        result.setSuccess(false);
        result.setDes("添加失敗");
        result.setStatus(0);
        return result;
    }

    }

    @RequestMapping("/getSpecBug")
    public @ResponseBody
    BugSpecOne getSpecBug(@RequestBody  Common common ){
        int bid = common.getBid();
        BugSpecOne content =bugServiceImp.getOneSpecBug(bid);
        return content;
    }

    @RequestMapping("/vaildBug")
    public @ResponseBody
    Result vaildBug(@RequestBody  Common common ){

        Result result = new Result();
        result.setSuccess(bugServiceImp.vaildContent(common.getBugId(),common.getChoose()));

        return result;
    }
}
