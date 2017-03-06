package com.zyz.design.abstractfactory;

/**
 * 接口工厂,创建订单主,子记录对应的DAO对象
 * Created by zyz on 17/3/4.
 *
 */
public abstract class DaoFactory {

    /**
     * 创建订单主记录对应的OrderDetailDao对象
     * @return
     */
    public abstract OrderMainDao createOrderMainDao();

    /**
     * 创建订单子记录对应的OrderDetailDao对象
     * @return
     */
    public abstract OrderDetailDao createOrderDetailDao();
}
