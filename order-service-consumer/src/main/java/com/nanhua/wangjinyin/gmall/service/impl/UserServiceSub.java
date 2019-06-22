package com.nanhua.wangjinyin.gmall.service.impl;

import java.util.List;

import org.jboss.netty.util.internal.StringUtil;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.nanhau.wangjinyin.gmall.bean.UserAddress;
import com.nanhau.wangjinyin.gmall.service.UserService;

public class UserServiceSub implements UserService {

    private  final UserService userService;
    
    //传入的是userService的远程代理对象    
	public UserServiceSub(UserService userService) {
		this.userService = userService;
	}


	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		
        if(StringUtils.isEmpty(userId)) {
        	System.out.println("本地从根被调用");
        	return userService.getUserAddressList(userId);
        }
		return null;
	}

}
