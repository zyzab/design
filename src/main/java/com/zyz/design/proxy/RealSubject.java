package com.zyz.design.proxy;

/**
 * Created by zyz on 2017/3/9.
 */
public class RealSubject implements Subject{

    private String name;

    public RealSubject(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void request() {
        System.out.println("Hello!"+this.name);
    }
}
