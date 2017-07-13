package com.example.demo.dao;

import com.example.demo.pojo.User;

import java.util.List;

/**
 * Created by admin on 2017/7/12.
 */
public interface UserDao {
    List<User> findAll();
    User findbyId(Integer id);
}
