package com.zyz.design.builder;

/**
 * Created by zyz on 17/3/4.
 */
public class Actor {
    private  String type; //角色类型
    private  String sex; //性别
    private  String face; //脸型
    private  String costume; //服装
    private  String hairstyle; //发型

    public Actor(ConcreteBuilder concreteBuilder){
        this.type = concreteBuilder.getType();
        this.sex = concreteBuilder.getSex();
        this.face = concreteBuilder.getFace();
        this.costume = concreteBuilder.getCostume();
        this.hairstyle = concreteBuilder.getHairstyle();
    }

    public  void setType(String type) {
        this.type  = type;
    }
    public  void setSex(String sex) {
        this.sex  = sex;
    }
    public  void setFace(String face) {
        this.face  = face;
    }
    public  void setCostume(String costume) {
        this.costume  = costume;
    }
    public  void setHairstyle(String hairstyle) {
        this.hairstyle  = hairstyle;
    }
    public  String getType() {
        return  (this.type);
    }
    public  String getSex() {
        return  (this.sex);
    }
    public  String getFace() {
        return  (this.face);
    }
    public  String getCostume() {
        return  (this.costume);
    }
    public  String getHairstyle() {
        return  (this.hairstyle);
    }
}
