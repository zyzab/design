package com.zyz.design.factorymethod;

/**
 * 文件日志记录器工厂类：具体工厂
 * Created by zyz on 2017/3/3.
 */
public class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}
