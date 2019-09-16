package com.linjingc.mybaitissourcecodedemo.service;

import com.linjingc.mybaitissourcecodedemo.dao.UserMapper;
import com.linjingc.mybaitissourcecodedemo.entity.BasicUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author cxc
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
	@Resource
	private UserMapper userMapper;

	public BasicUser findUser(String name) {
		return userMapper.findUser(name);
	}

	public void saveUser() {
		for (int i = 0; i < 100; i++) {
			userMapper.insert("小明" + i, "123456", i);
		}
	}


}
