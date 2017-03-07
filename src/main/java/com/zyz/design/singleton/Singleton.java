package com.zyz.design.singleton;

/**
 * Created by zyz on 17/3/5.
 * 饿汉式
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }
}
