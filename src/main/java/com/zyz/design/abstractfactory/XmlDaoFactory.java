package com.zyz.design.abstractfactory;

/**
 * Created by zyz on 17/3/4.
 */
public class XmlDaoFactory extends DaoFactory{

    public OrderMainDao createOrderMainDao() {
        return new XmlOrderMainDaoImpl();
    }

    public OrderDetailDao createOrderDetailDao() {
        return new XmlOrderDetailDaoImpl();
    }
}
