package com.zyz.design.factorymethod;

/**
 * 日志记录器工厂接口:抽象工厂
 * Created by zyz on 2017/3/3.
 */
public abstract class  LoggerFactory {

    public void writeLog(){
        Logger logger = createLogger();
        logger.writeLog();
    }

    protected abstract Logger createLogger();
}
