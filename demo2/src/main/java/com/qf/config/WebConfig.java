package com.qf.config;

import com.qf.filter.MyFilter;
import com.qf.interceptor.AuthInterceptor;
import com.qf.listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebConfig.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月29日 19:10:00
 * @Param $
 * @return $
 * @path com.qf.config
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private MyFilter myfilter;

    @Autowired
    private MyListener myListener;

    @Autowired
    private AuthInterceptor myInterceptor;

    @Bean
    public FilterRegistrationBean init(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(myfilter);
        filterRegistrationBean.setName("myfilter");
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean getListenerBean(){
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(myListener);
        return servletListenerRegistrationBean;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }
}
