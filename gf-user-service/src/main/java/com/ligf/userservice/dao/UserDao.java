package com.ligf.userservice.dao;

import com.ligf.user.User;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName UserDao
 * @Description 用户Dao
 * @Author garment
 * @Date 2021/3/16 0:29
 **/
public interface UserDao {

    /**
     * 根据账号密码查找对应的用户（@Param用于为请求参数指定引用别名）
     * @param name
     * @param password
     * @return
     */
    User findByUserNameAndPw(@Param("userName") String name, String password);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);
}
