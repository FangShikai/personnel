package com.SSM.service.imp;

import org.springframework.beans.factory.annotation.Autowired;

import com.SSM.mapper.UserMapper;
import com.SSM.pojo.User;
import com.SSM.service.UserService;

public class UserServiceImp implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User selectUser(User user) {
		return userMapper.selectUser(user);
	}

}
