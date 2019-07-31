package com.qf.controller;

import com.qf.entity.TUser;
import com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月29日 21:11:00
 * @Param $
 * @return $
 * @path com.qf.controller
 **/
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("getById/{id}")
    public TUser getById(@PathVariable("id") Long id){
        return userService.getById(id);
    }
}
