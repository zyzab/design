package com.zyz.design.proxy;

/**
 * Created by zyz on 2017/3/9.
 */
public class Proxy implements Subject{

    private  Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        this.subject.request();
    }

    @Override
    public String getName() {
        return null;
    }
}
