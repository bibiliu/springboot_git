package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName BootDemo.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月27日 11:57:00
 * @Param $
 * @return $
 * @path com.qf
 **/
@Controller
public class BootDemoController {
    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){
        return "Hello,SpringBoot";
    }
}
