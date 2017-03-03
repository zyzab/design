package com.zyz.design.simplefactory;

/**
 * 工厂类，用来创建Api对象
 * Created by zyz on 2017/3/3.
 */
public class Factory {

    /**
     * 创建具体Api对象方法
     * @param condition 从外部传入的选择条件
     * @return 创建好的Api对象
     */
    public static Api createApi(int condition){
        Api api = null;
        if(1==condition){
            api = new ImplA();
        }else if(2==condition){
            api = new ImplB();
        }
        return api;
    }
}
