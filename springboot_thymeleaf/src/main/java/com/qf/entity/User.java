package com.qf.entity;

import lombok.Data;

import javax.validation.constraints.*;

/**
 * @ClassName User.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月30日 17:51:00
 * @Param $
 * @return $
 * @path com.qf.entity
 **/
@Data
public class User {
    @NotNull
    private Long id;
    @NotEmpty
    private String username;

    @Min(6)
    @Max(10)
    @NotBlank(message = "手机号不能为空")
    private String password;

    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机格式错误")
    private Integer phone;

    public User(@NotNull Long id, @NotEmpty String username, @Min(6) @Max(10) @NotBlank(message = "手机号不能为空") String password, @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$", message = "手机格式错误") Integer phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public User(){}
}
