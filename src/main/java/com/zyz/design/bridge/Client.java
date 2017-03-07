package com.zyz.design.bridge;

/**
 * Created by zyz on 2017/3/7.
 */
public class Client {

    public static void main(String[] args) {
        //创建具体的消息实现对象
        MessageImplementor messageImplementor = new MessageSMS();
        //创建一个普通消息对象
        AbstractMessage message = new CommonMessage(messageImplementor);

        message.sendMessage("请喝一杯茶","小李");

        //创建一个加急的信息对象
        message = new UrgencyMessage(messageImplementor);
        message.sendMessage("请喝一杯茶","小李");

        //把消息的实现方式切换成手机
        messageImplementor = new MessageEmail();
        message = new CommonMessage(messageImplementor);
        message.sendMessage("请喝一杯茶","小李");

        //创建一个加急的信息对象
        message = new UrgencyMessage(messageImplementor);
        message.sendMessage("请喝一杯茶","小李");


    }
}
