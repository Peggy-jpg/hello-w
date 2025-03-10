package com.example.demo.service.impl;

import com.example.demo.mapper.UserDao;
import com.example.demo.pojo.dto.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public User getUserById(int id) {
        return null;
    }
}
