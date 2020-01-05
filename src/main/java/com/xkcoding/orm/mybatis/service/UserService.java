package com.xkcoding.orm.mybatis.service;

import java.util.List;

import com.xkcoding.orm.mybatis.entity.User;

public interface UserService {

	List<User> selectAllUser();

	User selectUserById(Long id);

	int saveUser(User user);

	int deleteById(Long id);

}
