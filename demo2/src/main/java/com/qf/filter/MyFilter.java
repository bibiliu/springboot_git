package com.qf.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName MyFilter.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月29日 19:06:00
 * @Param $
 * @return $
 * @path com.qf.filter
 **/
@Component
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.err.println("init...Filter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.err.println("doFilter...Filter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.err.println("destory...Filter");
    }
}
