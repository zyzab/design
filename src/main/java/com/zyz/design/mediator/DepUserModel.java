package com.zyz.design.mediator;

/**
 * 部门和人员关系类
 * Created by zyz on 17/3/11.
 */
public class DepUserModel {

    private String depUserId;

    private String depId;

    private String userId;

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepId() {
        return depId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDepUserId() {
        return depUserId;
    }

    public String getUserId() {
        return userId;
    }

    public void setDepUserId(String depUserId) {
        this.depUserId = depUserId;
    }
}

