package com.zyz.design.bridge;

/**
 * Created by zyz on 2017/3/7.
 */
public class MessageEmail implements MessageImplementor{
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用E-Mail的方式，发送消息message = [" + message + "], toUser = [" + toUser + "]");
    }
}
