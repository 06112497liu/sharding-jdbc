package com.example.sharding.jdbc;

import com.example.sharding.jdbc.dao.OrderDao;
import com.example.sharding.jdbc.vo.OrderVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingJdbcApplicationTests {

	@Autowired
	private OrderDao orderDao;

	@Test
	public void test01() {
		OrderVo orderInfo = this.orderDao.getOrderInfo(54584L);
		System.out.println(orderInfo);
	}

	@Test
	public void contextLoads() {
	}

}
