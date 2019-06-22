package com.nanhua.wangjinyin.gmall.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.MethodConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.nanhau.wangjinyin.gmall.service.UserService;

@Configuration
public class DubboConfig {
	
	/*@Bean
	public ApplicationConfig applicationConfig() {
		
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("boot-user-service-provider");
		return  applicationConfig;
	}
	
	@Bean
	public RegistryConfig registryConfig() {

		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setProtocol("zookeeper");
		registryConfig.setAddress("127.0.0.1:2181");
		return registryConfig;
	}
	
	@Bean
	public ProtocolConfig protocolConfig() {
		
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setName("dubbo");
		protocolConfig.setPort(20882);
		return protocolConfig;
	}
	
    
	/**
	 *  <dubbo:service interface="com.nanhau.wangjinyin.gmall.service.UserService" ref="userService01" 
         version="1.0.0"/>
	 * @return
	 */
	/*public ServiceConfig<UserService> serviceConfig(UserService userService) {
		ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
		serviceConfig.setInterface(UserService.class);
		serviceConfig.setRef(userService);
		serviceConfig.setTimeout(5000);
		serviceConfig.setVersion("1.0.0");
		
		MethodConfig methodConfig = new MethodConfig(); 
		methodConfig.setName("getUserAddressList");
		methodConfig.setTimeout(5000);
		List<MethodConfig> methods = new ArrayList<>();
		methods.add(methodConfig);
		serviceConfig.setMethods(methods);
		return serviceConfig;
	}	*/

}
