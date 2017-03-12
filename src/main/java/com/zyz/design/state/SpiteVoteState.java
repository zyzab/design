package com.zyz.design.state;

/**
 * Created by zyz on 17/3/11.
 */
public class SpiteVoteState implements VoteState {
    public void vote(String userName, String voteItem, VoteManager voteManager) {

        if(null!=voteManager.getVoteMap().get(userName)){
            voteManager.getVoteMap().remove(userName);
        }
        System.out.println("你有恶意刷票行为,取消投票资格");
        if(voteManager.getVoteCountMap().get(userName)>=7){
            voteManager.getVoteStateMap().put(userName,new BlackVoteState());
        }
    }
}
