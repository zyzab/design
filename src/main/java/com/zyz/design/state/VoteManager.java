package com.zyz.design.state;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zyz on 17/3/11.
 */
public class VoteManager {

    /**
     * 记录当前每个用户对应的状态处理对象
     * Map<String,VoteState></用户名称,当前对应的状态处理对象>
     */
    private Map<String,VoteState> voteStateMap = new HashMap<String,VoteState>();

    /**
     * 记录用户投票的结果
     * Map<用户名称,投票的选项>
     */
    private Map<String,String> voteMap = new HashMap<String, String>();

    /**
     * 记录用户投票次数
     * Map<用户名称,投票的次数>
     */
    private Map<String,Integer> voteCountMap = new HashMap<String, Integer>();

    public Map<String, Integer> getVoteCountMap() {
        return voteCountMap;
    }

    public Map<String, String> getVoteMap() {
        return voteMap;
    }

    public Map<String, VoteState> getVoteStateMap() {
        return voteStateMap;
    }

    /**
     * 投票
     * @param userName 用户名称
     * @param voteItem 投票选项
     */
    public void vote(String userName,String voteItem){
        Integer oldVoteCount = this.voteCountMap.get(userName);
        if (oldVoteCount==null){
            oldVoteCount = 0;
        }
        oldVoteCount = oldVoteCount + 1;
        this.voteCountMap.put(userName,oldVoteCount);
        VoteState state = voteStateMap.get(userName);
        if(null==state){
           state = new NormalVoteState();
        }
        state.vote(userName,voteItem,this);
    }
}
