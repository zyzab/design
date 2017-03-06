package com.zyz.design.builder;

/**
 *
 * Created by zyz on 17/3/4.
 */
public class ActorDirector {

    private ActorBuilder actorBuilder;

    public ActorDirector(ActorBuilder actorBuilder){
        this.actorBuilder = actorBuilder;
    }

    public Actor construct(){
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        actorBuilder.buildHairstyle();
        return actorBuilder.build();
    }

}
