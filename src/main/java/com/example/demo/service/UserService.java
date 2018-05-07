package com.example.demo.service;

import com.example.demo.repository.UserRepositoty;
import com.example.demo.entity.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;

    public UserBean findUserByName(String name) {
        UserBean user = null;
        try {
            user = userRepositoty.findByUserName(name);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return user;
    }
}
