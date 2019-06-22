package com.nanhua.wangjinyin.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;


@EnableDubbo
@EnableHystrix
@SpringBootApplication
public class BootUserServiceConsumer2Application {

	public static void main(String[] args) {
		SpringApplication.run(BootUserServiceConsumer2Application.class, args);
	}

}
