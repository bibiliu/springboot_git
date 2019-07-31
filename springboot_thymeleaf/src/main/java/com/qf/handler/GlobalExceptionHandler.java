package com.qf.handler;

import com.qf.entity.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName ExceptionHandler.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月30日 20:52:00
 * @Param $
 * @return $
 * @path com.qf.controller
 **/
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handlerException(Exception exception){
        //把异常信息记录到日志中
        exception.printStackTrace();
        return new ResultBean("500", exception.getMessage());
    }
}
