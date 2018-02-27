package com.debugger.service.imp;

import com.debugger.dao.UserDao;
import com.debugger.pojo.User;
import com.debugger.pojo.UserListPojo;
import com.debugger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserDao userDao;


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


}
