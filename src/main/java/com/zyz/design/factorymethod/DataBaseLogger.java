package com.zyz.design.factorymethod;

/**
 * 数据库日志记录器:具体产品
 * Created by zyz on 2017/3/3.
 */
public class DataBaseLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
