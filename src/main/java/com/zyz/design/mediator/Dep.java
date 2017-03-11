package com.zyz.design.mediator;

/**
 * 部门类
 * Created by zyz on 17/3/11.
 */
public class Dep {

    private String depId;

    private String depName;

    /**
     * 撤销部门
     * @return
     */
    public boolean deleteDep(){
        return true;
    }

    public String getDepId() {
        return depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
}
