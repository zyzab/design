package com.zyz.design.builder;

/**
 * Created by zyz on 17/3/4.
 */
public class ConcreteBuilder {

    private  String type; //角色类型
    private  String sex; //性别
    private  String face; //脸型
    private  String costume; //服装
    private  String hairstyle; //发型

    public ConcreteBuilder(String type,String sex,String face){
        this.type = type;
        this.sex = sex;
        this.face = face;
    }

    public ConcreteBuilder builderCostume(String costume){
        this.costume = costume;
        return this;
    }

    public ConcreteBuilder builderHairstyle(String hairstyle){
        this.hairstyle = hairstyle;
        return this;
    }

    public Actor build(){
        return new Actor(this);
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
