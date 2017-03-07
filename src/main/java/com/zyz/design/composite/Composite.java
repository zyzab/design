package com.zyz.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyz on 17/3/8.
 */
public class Composite extends Component{

    private List<Component> childComponents = null;

    private String name;

    public Composite(String name){
        this.name = name;
    }

    public void addChild(Component child){
        if(null==childComponents){
            childComponents = new ArrayList<Component>();
        }
        childComponents.add(child);
    }


    @Override
    public void printStruct(String preStr) {
        System.out.println("[" + preStr +"-"+name+ "]");
        if(null!=this.childComponents){
            preStr+=" ";
            for (Component c : childComponents){
                c.printStruct(preStr);
            }
        }
    }
}
