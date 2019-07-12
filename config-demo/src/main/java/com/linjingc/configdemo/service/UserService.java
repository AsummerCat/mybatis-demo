package com.linjingc.configdemo.service;

import com.linjingc.configdemo.dao.UserMapper;
import com.linjingc.configdemo.entity.BasicUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author cxc
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public BasicUser findUser(String name) {
        return userMapper.findUser(name);
    }

    public void saveUser() {
        for (int i = 0; i < 100; i++) {
            userMapper.insertUser("小明" + i, "123456", i);
        }
    }


}
