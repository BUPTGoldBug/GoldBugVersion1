package com.debugger.service.imp;

import com.debugger.dao.UserDao;
import com.debugger.pojo.User;
import com.debugger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserDao userDao;


    @Override
    public User getUser(String userId) {
        return userDao.getUserModel(userId);
    }
}
