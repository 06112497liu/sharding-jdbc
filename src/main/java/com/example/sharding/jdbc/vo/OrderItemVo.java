package com.example.sharding.jdbc.vo;

import lombok.Data;

/**
 * @author liuweibo
 * @date 2018/10/31
 */
@Data
public class OrderItemVo {

    Long orderItemId;

    Long orderId;

    String productName;

}
