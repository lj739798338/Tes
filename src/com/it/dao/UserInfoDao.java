package com.it.dao;

import com.it.bean.UserInfo;
import com.it.service.IUserInfoService;

public class UserInfoDao implements IUserInfoDao {
     
	@Override
	public void add(UserInfo userinfo) {
		
		System.out.println("------UserInfoDao-------");
	}

	
}
