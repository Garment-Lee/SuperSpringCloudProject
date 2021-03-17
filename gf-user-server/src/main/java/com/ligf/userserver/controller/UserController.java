package com.ligf.userserver.controller;

import com.ligf.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addUser(@RequestBody User user){

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(@RequestParam String name, @RequestParam String password){

    }

}
