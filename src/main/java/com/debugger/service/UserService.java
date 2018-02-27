package com.debugger.service;

import com.debugger.pojo.User;
import com.debugger.pojo.UserListPojo;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
     User getUser(String userId);
     UserListPojo getUserList(String userName);
     User getUserDetail(String uid);

}
