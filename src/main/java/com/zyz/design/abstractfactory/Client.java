package com.zyz.design.abstractfactory;

/**
 * Created by zyz on 17/3/4.
 */
public class Client {

    public static void main(String[] args) {
        DaoFactory daoFactory = new RdbDaoFactory();
        OrderMainDao orderMainDao = daoFactory.createOrderMainDao();
        OrderDetailDao orderDetailDao = daoFactory.createOrderDetailDao();
        orderMainDao.saveOrderMain();
        orderDetailDao.saveOrderDetail();
    }
}
