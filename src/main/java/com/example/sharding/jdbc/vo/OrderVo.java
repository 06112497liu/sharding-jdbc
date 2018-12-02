package com.example.sharding.jdbc.vo;


import lombok.Data;

import java.util.List;

/**
 * @author liuweibo
 * @date 2018/10/31
 */
@Data
public class OrderVo {

    Long orderId;

    Long userId;

    /**
     * 订单包含的商品
     */
    List<OrderItemVo> items;
}
