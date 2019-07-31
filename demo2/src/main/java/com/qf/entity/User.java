package com.qf.entity;

import java.util.Date;

/**
 * @ClassName User.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月29日 13:05:00
 * @Param $
 * @return $
 * @path com.qf.entity
 **/
//@JsonInclude(JsonInclude.Include.NON_NULL)空字段不返回
public class User {
    private String username;
    private String password;
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") 设置响应的时间格式
    //@JsonIgnore 指定字段不返回
    private Date entryTime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

}
