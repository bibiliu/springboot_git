package com.qf.service;

import com.qf.entity.TUser;

/**
 * @ClassName IUserService.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月29日 21:15:00
 * @Param $
 * @return $
 * @path com.qf.service
 **/
public interface IUserService {
    TUser getById(Long id);
}
