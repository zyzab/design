package com.zyz.design.bridge;

import java.util.Objects;

/**
 * Created by zyz on 2017/3/7.
 */
public class SpecialUrgencyMessage extends AbstractMessage{
    public SpecialUrgencyMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }
    public void sendMessage(String message,String toUser){
        message = "特急：" + message;
        super.sendMessage(message,toUser);
    }

    public void hurry(String messageId){
        //执行催促的业务，发出催促的信息
    }
}
