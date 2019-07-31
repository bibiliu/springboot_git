package com.qf.controller;

import com.qf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName UserController.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月30日 18:05:00
 * @Param $
 * @return $
 * @path com.qf.controller
 **/
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("demo")
    public String demo(Model model){
        String username="zs";
        model.addAttribute("username",username);
        return "index";
    }

    @RequestMapping("test")
    public String test(Model model){
        User user = new User(1L,"zs","123",13712378);
        User user1 = new User(2l, "ls", "1",13712378);
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        model.addAttribute("users",users);
        model.addAttribute("user",user);
        model.addAttribute("time",new Date());
        model.addAttribute("money",100);
        return "index";

    }
}
