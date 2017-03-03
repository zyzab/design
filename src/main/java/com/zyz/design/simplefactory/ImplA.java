package com.zyz.design.simplefactory;

/**
 * Created by zyz on 2017/3/3.
 */
public class ImplA implements Api {
    @Override
    public void operation(String s) {
        //实现具体功能的代码
        System.out.println("ImplA s==" + s);
    }
}
