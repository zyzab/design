package com.zyz.design.mediator;

/**
 * 人员类
 * Created by zyz on 17/3/11.
 */
public class User {

    private String userId;

    private String userName;

    /**
     * 人员离职
     * @return
     */
    public boolean dimisson(){
        return true;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
