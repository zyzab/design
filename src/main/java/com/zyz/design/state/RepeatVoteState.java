package com.zyz.design.state;

/**
 * Created by zyz on 17/3/11.
 */
public class RepeatVoteState implements VoteState{
    public void vote(String userName, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票"+"userName = [" + userName + "], voteItem = [" + voteItem + "], voteManager = [" + voteManager + "]");
        if(voteManager.getVoteCountMap().get(userName)>=4){
            voteManager.getVoteStateMap().put(userName,new SpiteVoteState());
        }
    }
}
