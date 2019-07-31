package com.qf.service.impl;

import com.qf.entity.TUser;
import com.qf.mapper.TUserMapper;
import com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月29日 21:15:00
 * @Param $
 * @return $
 * @path com.qf.service.impl
 **/
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private TUserMapper userMapper;
    @Override
    public TUser getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
