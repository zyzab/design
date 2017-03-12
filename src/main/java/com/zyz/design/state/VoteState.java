package com.zyz.design.state;

/**
 * 封装一个投票状态相关的行为
 * Created by zyz on 17/3/11.
 */
public interface VoteState {

    /**
     * 处理状态对应的行为
     * @param userName     用户名称
     * @param voteItem     投票项
     * @param voteManager  投票上下文
     */
    public void vote(String userName,String voteItem,VoteManager voteManager);
}
