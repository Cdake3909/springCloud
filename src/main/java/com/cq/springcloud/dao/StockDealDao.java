package com.cq.springcloud.dao;
import com.cq.springcloud.model.Order;


public interface StockDealDao {
    int buildOrder(Order order);
}
