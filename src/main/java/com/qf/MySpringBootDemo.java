package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName MySpringBootDemo.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月27日 11:18:00
 * @Param $
 * @return $
 * @path com.qf
 **/
//声明该类是SpringBoot引导类
@SpringBootApplication
public class MySpringBootDemo {
    public static void main(String[] args) {
        //run表示运行SpringBoot的引导类，参数为引导类的字节码文件
        SpringApplication.run(MySpringBootDemo.class);
        System.out.println("hello,springboot");
    }
}
