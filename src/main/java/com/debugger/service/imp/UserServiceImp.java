package com.debugger.service.imp;

import com.debugger.dao.UserDao;
import com.debugger.model.User;
import com.debugger.model.UserListPojo;
import com.debugger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserDao userDao;

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String username;

    @Override
    public UserListPojo getUserList(String userName) {
        UserListPojo userListPojo = new UserListPojo();
        List<User> list=  userDao.getUserList(userName);
        userListPojo.setUserList(list);
        return userListPojo;
    }

    @Override
    public User getUserDetail(String uid) {
        return userDao.getUserDetail(uid);
    }

    @Override
    public User getUser(String userId) {
        return userDao.getUserModel(userId);
    }
    @Override
    public  String sendEmail(String toEmailAddress){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(username);
        message.setTo(toEmailAddress);
        message.setSubject("标题：dddd");
        message.setText("测试内容部份");
        try {
            javaMailSender.send(message);
            return "success";
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "failed";

        }


    }

}
