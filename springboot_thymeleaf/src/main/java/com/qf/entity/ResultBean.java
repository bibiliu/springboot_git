package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName ResultBean.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月30日 20:49:00
 * @Param $
 * @return $
 * @path com.qf.entity
 **/
@Data
@AllArgsConstructor
public class ResultBean<T> {
    private String respCode;
    private T data;
}
