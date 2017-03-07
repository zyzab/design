package com.zyz.design.bridge;

/**
 * Created by zyz on 2017/3/7.
 */
public class CommonMessage extends AbstractMessage{
    public CommonMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }
    public void sendMessage(String message,String toUser){
        super.sendMessage(message,toUser);
    }
}
