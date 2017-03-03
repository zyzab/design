package com.zyz.design.factorymethod;

/**
 * Created by zyz on 2017/3/3.
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory = new FileLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();
    }
}
