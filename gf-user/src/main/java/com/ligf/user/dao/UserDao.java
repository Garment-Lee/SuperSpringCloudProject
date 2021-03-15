package com.ligf.user.dao;

import com.ligf.user.User;

/**
 * @ClassName UserDao
 * @Description 用户Dao
 * @Author garment
 * @Date 2021/3/16 0:29
 **/
public interface UserDao {
    User findByUserNameAndPw(String name, String pw);

    int addUser(User user);
}
