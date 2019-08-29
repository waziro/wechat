package com.waziro.sell.dataobject;

import com.waziro.sell.enums.OrderStatusEnum;
import com.waziro.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    //订单id
    @Id
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
    private Integer orderStatus= OrderStatusEnum.NEW.getCode();
    //订单支付状态，默认为0，等待支付
    private Integer payStatus= PayStatusEnum.WAIT.getCode();

    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;

}
