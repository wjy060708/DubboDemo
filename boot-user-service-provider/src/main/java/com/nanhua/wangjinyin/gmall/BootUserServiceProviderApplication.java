package com.nanhua.wangjinyin.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;


//@EnableDubbo  //开启基于注解的Dubbo功能
//@EnableDubbo(scanBasePackages="com.nanhua.wangjinyin.gmall")
@ImportResource(locations="classpath:provider.xml")
@SpringBootApplication
@EnableHystrix   //开启服务容错
public class BootUserServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserServiceProviderApplication.class, args);
	}
}
