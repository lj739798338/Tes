package com.it.service;

import com.it.bean.UserInfo;
import com.it.dao.IUserInfoDao;
import com.it.dao.UserInfoDao;

public class UserInfoService implements IUserInfoService {

	IUserInfoDao iUserInfoDao=new UserInfoDao();
	@Override
	public void add(UserInfo userinfo) {
		iUserInfoDao.add(userinfo);
		System.out.println("-------UserInfoService------------");

	}

}
