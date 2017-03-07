package com.zyz.design.abstractfactory;

/**
 * Created by zyz on 17/3/4.
 */
public class RdbDaoFactory extends DaoFactory{

    public OrderMainDao createOrderMainDao() {
        return new RdbOrderMainDaoImpl();
    }

    public OrderDetailDao createOrderDetailDao() {
        return new RdbOrderDetailDaoImpl();
    }
}
