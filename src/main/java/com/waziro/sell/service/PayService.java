package com.waziro.sell.service;

import com.waziro.sell.dto.OrderDTO;

public interface PayService {
    void create(OrderDTO orderDTO);
}
