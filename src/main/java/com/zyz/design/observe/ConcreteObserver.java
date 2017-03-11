package com.zyz.design.observe;

/**
 * Created by zyz on 17/3/11.
 */
public class ConcreteObserver implements  Observer{

    private String observerState;

    public void update(Subject subject) {
        System.out.println("observerState="+((ConcreteSubject)subject).getSubjectState());
    }
}
