package com.zyz.design.bridge;

import java.util.Objects;

/**
 * Created by zyz on 2017/3/7.
 */
public class UrgencyMessage extends AbstractMessage{
    public UrgencyMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }
    public void sendMessage(String message,String toUser){
        message = "加急：" + message;
        super.sendMessage(message,toUser);
    }

    public Objects watch(String messageId){
        //获取相应的数据，组织成监控的数据对象，然后返回
        return null;
    }
}
