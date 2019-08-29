package com.waziro.sell.dto;

import com.waziro.sell.dataobject.OrderDetail;
import com.waziro.sell.enums.OrderStatusEnum;
import com.waziro.sell.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {
    //订单id
    private String orderId;
    //买家姓名
    private String buyerName;
    //买家手机号码
    private String buyerPhone;
    //买家联系地址
    private String buyerAddress;
    //买家微信openid
    private String buyerOpenid;
    //订单总金额
    private BigDecimal orderAmount;
    //订单状态，默认为0，新下单
    private Integer orderStatus;
    //订单支付状态，默认为0，等待支付
    private Integer payStatus;

    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
