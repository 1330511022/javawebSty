package com.zsz.darryring.service;

import com.zsz.darryring.domain.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zsz.darryring.domain.User;

import java.util.Date;

/**
* @author zsz
* @description 针对表【order】的数据库操作Service
*/
public interface OrderService extends IService<Order> {

    String addOrder(Date date, User user, Integer aid, String s);

    void changeOrderStatues(String oid);
}
