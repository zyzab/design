package com.zyz.design.state;

/**
 * Created by zyz on 17/3/11.
 */
public class Client {

    public static void main(String[] args) {
        VoteManager voteManager = new VoteManager();
        for (int i=0;i<8;i++){
            voteManager.vote("zyz","A");
        }
    }
}
