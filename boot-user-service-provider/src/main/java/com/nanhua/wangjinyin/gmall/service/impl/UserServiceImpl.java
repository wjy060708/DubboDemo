package com.nanhua.wangjinyin.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.nanhau.wangjinyin.gmall.bean.UserAddress;
import com.nanhau.wangjinyin.gmall.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//暴露服务
@Service
@Component
public class UserServiceImpl implements UserService {

	@HystrixCommand   
	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....2...");
		UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		
		//模拟出错
		if(Math.random() > 0.5) {
			
			throw new RuntimeException();
		}
		return Arrays.asList(address1,address2);
	}

}
