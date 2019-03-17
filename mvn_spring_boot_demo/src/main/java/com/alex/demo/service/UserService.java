package com.alex.demo.service;

import com.alex.demo.mapper.UserMapper;
import com.alex.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserMapper: Alex
 * Date: 2019/3/16
 * Time: 21:50
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public void insertUser(User user) {
        userMapper.insert(user);
    }

}
