package com.waziro.sell.service;

import com.waziro.sell.dto.OrderDTO;

public interface BuyerService {
    //查询单个订单
    OrderDTO findOrderOne(String openid, String orderId);
    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
