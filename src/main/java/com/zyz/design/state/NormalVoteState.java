package com.zyz.design.state;

/**
 * Created by zyz on 17/3/11.
 */
public class NormalVoteState implements VoteState{
    public void vote(String userName, String voteItem, VoteManager voteManager) {
        voteManager.getVoteMap().put(userName,voteItem);
        System.out.println("恭喜投票成功"+"userName = [" + userName + "], voteItem = [" + voteItem + "], voteManager = [" + voteManager + "]");
        //正常投票完成,维护下一个状态,同一个人再投票就重复了
        voteManager.getVoteStateMap().put(userName,new RepeatVoteState());
    }
}
