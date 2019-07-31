package com.qf.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName AuthInterceptor.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月29日 19:44:00
 * @Param $
 * @return $
 * @path com.qf.interceptor
 **/
@Component
public class AuthInterceptor implements HandlerInterceptor {
    //controller调用之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("实现拦截器");
        return true;
    }

    //请求处理之后调用 但是在视图渲染之前
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }


    //整个请求之后调用，也就是在dispatcherServlet
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
