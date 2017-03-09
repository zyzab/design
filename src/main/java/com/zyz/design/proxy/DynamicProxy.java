package com.zyz.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zyz on 2017/3/9.
 */
public class DynamicProxy implements InvocationHandler{

    private Subject subject = null;

    public DynamicProxy(Subject subject){
        this.subject = subject;
    }

    public Subject getSubject(){
        return (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(subject.getName()+",come in");
        method.invoke(subject,args);
        return null;
    }
}
