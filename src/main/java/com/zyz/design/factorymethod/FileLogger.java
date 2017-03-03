package com.zyz.design.factorymethod;

/**
 * 文件日志记录器:具体产品
 * Created by zyz on 2017/3/3.
 */
public class FileLogger implements Logger{

    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
