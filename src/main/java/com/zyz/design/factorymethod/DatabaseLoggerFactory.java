package com.zyz.design.factorymethod;

/**
 * 数据库日志记录器工厂类：具体工厂
 * Created by zyz on 2017/3/3.
 */
public class DatabaseLoggerFactory extends LoggerFactory{

    @Override
    public Logger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DataBaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }
}
