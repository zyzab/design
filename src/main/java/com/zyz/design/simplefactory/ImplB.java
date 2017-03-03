package com.zyz.design.simplefactory;

/**
 * Created by zyz on 2017/3/3.
 */
public class ImplB implements Api {
    @Override
    public void operation(String s) {
        //实现功能的代码
        System.out.println("ImplB s=="+s);
    }
}
