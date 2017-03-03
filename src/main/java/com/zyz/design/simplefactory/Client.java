package com.zyz.design.simplefactory;

/**
 * Created by zyz on 2017/3/3.
 */
public abstract class Client extends Factory implements Api {

    public static void main(String[] args) {
        Api api = Factory.createApi(1);
        api.operation("hello");
    }

}
