package com.zyz.design.singleton;

/**
 * Created by zyz on 17/3/5.
 */
public class Client {

    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.getInstance();
        System.out.println("ip = [" + appConfig.getIp() + "]");
        System.out.println("name = [" + appConfig.getName() + "]");
    }
}
