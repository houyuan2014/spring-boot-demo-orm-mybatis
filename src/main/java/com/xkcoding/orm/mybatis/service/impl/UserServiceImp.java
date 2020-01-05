package com.xkcoding.orm.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xkcoding.orm.mybatis.entity.User;
import com.xkcoding.orm.mybatis.mapper.UserMapper;
import com.xkcoding.orm.mybatis.service.UserService;

@Service("userService")
public class UserServiceImp implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectAllUser() {
		return this.userMapper.selectAllUser();
	}

	@Override
	public User selectUserById(Long id) {
		return this.userMapper.selectUserById(id);
	}

	@Override
	public int saveUser(User user) {
		return this.userMapper.saveUser(user);
	}

	@Override
	public int deleteById(Long id) {
		return this.userMapper.deleteById(id);
	}

}
