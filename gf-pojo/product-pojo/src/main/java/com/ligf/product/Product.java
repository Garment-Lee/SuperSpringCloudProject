package com.ligf.product;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Product
 * @Description 产品实体对象
 * @Author Garment Lee
 * @Date 2021/3/21 22:45
 **/
@Data
public class Product implements Serializable {

    /**自增主键值*/
    private int id;

    /**唯一标识（雪花算法生成）*/
    private long uid;

    /**产品评分*/
    private String productName;

    /**产品评分*/
    private float score;
}
