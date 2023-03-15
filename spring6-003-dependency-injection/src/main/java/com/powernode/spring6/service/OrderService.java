package com.powernode.spring6.service;

import com.powernode.spring6.dao.OrderDao;
import com.powernode.spring6.dao.UserDao;

public class OrderService {
    private OrderDao orderDao;
    private UserDao userDao;

    public OrderService(OrderDao orderDao, UserDao userDao) {
        this.orderDao = orderDao;
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setOrderDao(OrderDao orderDao) {

        this.orderDao = orderDao;
    }

    /**
     * 生成订单的业务方法
     */
    public void generate(){

        orderDao.insert();
    }
    public void delete(){
        orderDao.deleteById();
        userDao.insert();
    }
}
