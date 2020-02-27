package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 郭子旭 on 2018/4/12
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/selectUserById",method = RequestMethod.POST)
    public User selectUserById(String id){
        User user = userMapper.selectUserById(Integer.parseInt(id));
        return  user;
    }

    @RequestMapping(value = "/selectUserByName",method = RequestMethod.POST)
    public List<User> selectUserByName(String name){
        return userMapper.selectUserByName(name);
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public void addUser(User user){
        userMapper.addUser(user);
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    public void deleteUser(String id){
        userMapper.deleteUser(Integer.parseInt(id));
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public void updateUser(User user){
        userMapper.updateUser(user);
    }
}