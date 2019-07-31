package com.qf.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @ClassName MyListener.java
 * @Author:BiBiLiu
 * @Description:
 * @createTime 2019年07月29日 19:20:00
 * @Param $
 * @return $
 * @path com.qf.listener
 **/
@Component
public class MyListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.err.println("Listener...destroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Listener...init");
    }
}
