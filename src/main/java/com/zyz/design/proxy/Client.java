package com.zyz.design.proxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by zyz on 2017/3/9.
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new RealSubject("zyz");
        DynamicProxy invocationHandler = new DynamicProxy(subject);
        subject = invocationHandler.getSubject();
        subject.request();
    }
}
