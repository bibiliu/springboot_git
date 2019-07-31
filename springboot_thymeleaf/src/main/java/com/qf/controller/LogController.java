package com.qf.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LogController.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月31日 00:51:00
 * @Param $
 * @return $
 * @path com.qf.controller
 **/
@RestController
@RequestMapping("log")
@Slf4j
public class LogController {
    private Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("write")
    public String write(){
        logger.debug("debug...");
        logger.info("info...");
        logger.error("error...");
        logger.warn("warn...");

        return "ok";
    }
}
