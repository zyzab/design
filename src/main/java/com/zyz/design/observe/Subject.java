package com.zyz.design.observe;

import java.util.*;

/**
 * 目标对象
 * Created by zyz on 17/3/11.
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<Observer>();

    /**
     * 注册观察者
     * @param observer
     */
    public void attach(Observer observer){
        observerList.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void detach(Observer observer){
        observerList.remove(observer);
    }

    /**
     * 通知所有注册的观察者
     */
    protected void notifyObservers(){
        for (Observer observer : observerList){
            observer.update(this);
        }
    }
}
