package com.zyz.design.composite;

/**
 * 抽象的组件对象
 * Created by zyz on 17/3/8.
 */
public abstract class Component {

    /**
     * 输出组件自身的名称
     * @param preStr
     */
    public abstract void printStruct(String preStr);

    /**
     * 向组件对象中加入组件对象
     * @param child
     */
    public void addChild(Component child){
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 从组件对象中移除某个组件对象
     * @param child
     */
    public void removeChild(Component child){
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 返回某个索引对应的组件对象
     * @param index
     * @return
     */
    public Component getChildren(int index){
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}
