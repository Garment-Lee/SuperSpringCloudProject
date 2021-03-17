package com.ligf.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description 用户Pojo
 * @Author Garment Lee
 * @Date 2021/3/16 0:38
 **/
@Data
public class User implements Serializable {

    /**自增主键值*/
    private int id;

    /**唯一标识（雪花算法生成）*/
    private long uid;

    private String userName;

    private String password;

    private int age;
}
