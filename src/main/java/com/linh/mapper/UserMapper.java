package com.linh.mapper;

import com.linh.model.User;

import java.util.List;


public interface UserMapper{

    List<User> findAll();
    User findById(Integer id);

    void insert(User user);
    void insertSelective(User user);

    void deleteById(Integer id);

    void updateByIdSelective(Integer id);
    void updateById(Integer id);
    void deleteSelectTive(User user);

    List<User> findSelective(User user);
}