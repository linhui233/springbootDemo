package com.linh.service;


import com.linh.mapper.UserMapper;
import com.linh.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAll(){
        List<User> users = new ArrayList<User>();
        users = userMapper.findAll();

        return users;

    }
}
