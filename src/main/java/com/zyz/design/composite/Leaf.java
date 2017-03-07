package com.zyz.design.composite;

/**
 * 叶子对象
 * Created by zyz on 17/3/8.
 */
public class Leaf extends Component{

    private String name = "";

    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println("[" + preStr +"-"+name+ "]");
    }
}
