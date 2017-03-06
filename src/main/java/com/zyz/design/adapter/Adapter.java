package com.zyz.design.adapter;

/**
 * Created by zyz on 17/3/6.
 */
public class Adapter implements Target{

    /**
     * 被适配的对象
     */
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        //转向调已经实现的方法,进行适配
        adaptee.specificRequest();
    }
}
