package com.nanhua.wangjinyin.gmall;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	
	public static void main(String[] args) throws IOException {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
	        context.start();
	        System.in.read(); // 按任意键退出
	}

}
