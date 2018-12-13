package com.SSM.service;

import com.SSM.pojo.User;

public interface UserService {


	//查询是否存在用户
	public User selectUser(User user);
}
