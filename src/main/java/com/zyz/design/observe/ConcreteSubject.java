package com.zyz.design.observe;

/**
 * Created by zyz on 17/3/11.
 */
public class ConcreteSubject extends Subject{

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState){
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
