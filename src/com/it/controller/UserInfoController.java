package com.it.controller;

import com.it.bean.UserInfo;
import com.it.service.IUserInfoService;
import com.it.service.UserInfoService;

public class UserInfoController {
	IUserInfoService iUserInfoService;
	UserInfo userinfo;
	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}


	public void setiUserInfoService(IUserInfoService iUserInfoService) {
		this.iUserInfoService = iUserInfoService;
	}


	
	public void add(UserInfo userinfo) {
		
		iUserInfoService.add(userinfo);
		System.out.println("-------UserInfoController---------");
	}
	
	
	public static void main(String[] args) {
		
	}
}
