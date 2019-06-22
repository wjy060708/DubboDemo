package com.nanhua.wangjinyin.gmall;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nanhau.wangjinyin.gmall.bean.UserAddress;
import com.nanhau.wangjinyin.gmall.service.OrderService;

public class MainApplication {
	
	    @SuppressWarnings("resource")
		public static void main(String[] args) throws IOException {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		 OrderService orderService = context.getBean(OrderService.class);
         
         List<UserAddress> addressList = orderService.initOrder("1");
 		for (UserAddress userAddress : addressList) {
 			System.out.println(userAddress.getUserAddress());
 		}
	     System.in.read(); // 按任意键退出
	}
	

}
