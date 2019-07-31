package com.qf.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName Resource.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月29日 17:03:00
 * @Param $
 * @return $
 * @path com.qf.entity
 **/
@Component
//@PropertySource("classpath:application.properties.bak")
@ConfigurationProperties(prefix="resource")
public class Resource {
    private String imageServer;
    private String emailServer;

    public String getImageServer() {
        return imageServer;
    }

    public void setImageServer(String imageServer) {
        this.imageServer = imageServer;
    }

    public String getEmailServer() {
        return emailServer;
    }

    public void setEmailServer(String emailServer) {
        this.emailServer = emailServer;
    }
}
