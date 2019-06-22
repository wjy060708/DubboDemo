package com.nanhua.wangjinyin.gmall.service.impl;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.nanhau.wangjinyin.gmall.bean.UserAddress;
import com.nanhau.wangjinyin.gmall.service.OrderService;
import com.nanhau.wangjinyin.gmall.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 1、将服务提供者注册到注册中心（暴露服务）
 * 		1）、导入dubbo依赖（2.6.2）\操作zookeeper的客户端(curator)
 * 		2）、配置服务提供者
 * 2、dubbo与springBoot整合的三种方式
 * 2.1 导入dubbo-start，在application.propertites配置属性  使用@Service暴露服务和@Reference引用服务  @EnableDubbo开启dubbo基于注解功能
 * 2.2 保留dubbo xml配置文件的方式  使用@ImportResource导入配置文件 
 * 2.3 使用注解API方式 
 * 3、让服务消费者去注册中心订阅服务提供者的服务地址
 * @author lfy
 *
 */

@Service
public class OrderServiceImpl implements OrderService {

	@Reference(loadbalance="random",timeout=1000)
	UserService userService;
	
	@HystrixCommand(fallbackMethod="hello")
	public List<UserAddress> initOrder(String userId) {
		// TODO Auto-generated method stub
		System.out.println("用户id："+userId);
		//1、查询用户的收货地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		return addressList;
	}
	
	public List<UserAddress> hello(String userId) {
		 
		UserAddress userAddress = new UserAddress(10, "测试地址", "1", "测试", "123456", "123");
		List<UserAddress> addressList = new ArrayList<>();
		addressList.add(userAddress);
		return addressList;
	}
}
