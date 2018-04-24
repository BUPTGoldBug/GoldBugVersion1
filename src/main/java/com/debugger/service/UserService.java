package com.debugger.service;

import com.debugger.model.User;
import com.debugger.model.UserListPojo;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
     User getUser(String userId);
     UserListPojo getUserList(String userName);
     User getUserDetail(String uid);
     String sendEmail(String toEmailAddress);
}
