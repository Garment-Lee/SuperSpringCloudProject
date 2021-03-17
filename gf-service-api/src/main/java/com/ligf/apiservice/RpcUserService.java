package com.ligf.apiservice;

import com.ligf.user.User;

/**
 * @ClassName RpcUserService
 * @Description TODO
 * @Author Garment Lee
 * @Date 2021/3/17 12:26
 **/
public interface RpcUserService {

    /**
     * 根据用户名和密码查找用户
     * @param name
     * @param password
     * @return
     */
    User getUserByNameAndPassword(String name, String password);

    /**
     * 新增用户
     * @param user
     * @return
     */
    User addUser(User user);
}
