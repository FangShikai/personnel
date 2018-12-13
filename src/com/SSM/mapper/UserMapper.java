package com.SSM.mapper;


import com.SSM.pojo.User;


public interface UserMapper {

	//查询有无此用户
	public User selectUser(User user);
	
}
