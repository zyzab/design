package com.zyz.design.bridge;

/**
 * Created by zyz on 2017/3/7.
 */
public abstract class AbstractMessage {

    protected MessageImplementor messageImplementor;

    public AbstractMessage(MessageImplementor messageImplementor){
        this.messageImplementor = messageImplementor;
    }

    public void sendMessage(String message,String toUser){
        this.messageImplementor.send(message,toUser);
    }
}
