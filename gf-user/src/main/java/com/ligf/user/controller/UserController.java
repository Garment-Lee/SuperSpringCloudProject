package com.ligf.user.controller;

import com.ligf.user.User;
import com.ligf.user.dao.UserDao;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Garment Lee
 * @Date 2021/3/15 1:18
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserDao userDao;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userDao.addUser(user);
    }

}
