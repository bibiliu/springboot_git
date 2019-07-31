package com.qf.controller;

import com.qf.entity.Resource;
import com.qf.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @ClassName UserController.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月29日 13:03:00
 * @Param $
 * @return $
 * @path com.qf.controller
 **/
@RestController
@RequestMapping("user")
public class UserController {
    /*@Value("${resource.imageServer}")
    private String img;

    @Value("${resource.emailServer}")
    private String email;*/

    @Autowired
    private Resource resource;

    @RequestMapping("add")
    public User add(User user){
        user.setEntryTime(new Date());
        return user;
    }
    @GetMapping("page")
    public String page(@RequestParam(name = "pageIndex",required = false,defaultValue = "1") Integer pageIndex){
        return "pageIndex"+pageIndex;
    }

    @PostMapping("addUser")
    public User addUser(User user){
        return user;
    }

    @GetMapping("proper")
    public String proper(){
        //return img+"---"+email;
        return resource.getEmailServer();
    }
}
