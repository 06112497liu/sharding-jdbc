package com.example.sharding.jdbc.dao;

import com.example.sharding.jdbc.vo.OrderVo;
import org.apache.ibatis.annotations.Param;

/**
 * @author liuweibo
 * @date 2018/11/21
 */
public interface OrderDao {

    OrderVo getOrderInfo(@Param("orderId") Long orderId);

}
