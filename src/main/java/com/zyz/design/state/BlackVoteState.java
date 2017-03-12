package com.zyz.design.state;

/**
 * Created by zyz on 17/3/11.
 */
public class BlackVoteState implements  VoteState{
    public void vote(String userName, String voteItem, VoteManager voteManager) {
        System.out.println("进入黑名单,将禁止登录和使用本系统");
    }
}
