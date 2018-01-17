package com.debugger.dao;

import com.debugger.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserDao {
    public User getUserModel(String uid);

}
