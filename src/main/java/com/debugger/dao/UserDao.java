package com.debugger.dao;

import com.debugger.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserDao {
     User getUserModel(String uid);
     List<User> getUserList(String userName);
     User getUserDetail(String uid);
}
