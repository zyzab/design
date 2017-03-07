package com.zyz.design.singleton;

/**
 * 读取应用配置文件,单例实现
 * Created by zyz on 17/3/5.
 */
public class AppConfig {

    private AppConfig(){
        init();
    }

    private static AppConfig instance = new AppConfig();

    public static AppConfig getInstance(){
        return instance;
    }

    private String ip;
    private String name;

    private void init(){
        ip = "127.0.0.1";
        name = "zyz";
    }

    public String getIp() {
        return ip;
    }

    public String getName() {
        return name;
    }
}
