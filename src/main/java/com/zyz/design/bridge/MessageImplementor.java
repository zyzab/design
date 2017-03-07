package com.zyz.design.bridge;

/**
 * 实现发送消息的统一接口
 * Created by zyz on 2017/3/7.
 */
public interface MessageImplementor {
    /**
     * 发送消息
     * @param message  消息内容
     * @param toUser   目的用户
     */
    public void send(String message,String toUser);
}
