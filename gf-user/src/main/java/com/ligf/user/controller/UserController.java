package com.ligf.user.controller;

import com.ligf.user.User;
import com.ligf.user.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

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

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserDao userDao;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userDao.addUser(user);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(@RequestParam String name, @RequestParam String password){
        User user = userDao.findByUserNameAndPw(name, password);
        logger.info("login user:" + user);
    }

}
