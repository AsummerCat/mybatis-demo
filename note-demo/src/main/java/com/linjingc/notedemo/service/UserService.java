package com.linjingc.notedemo.service;

import com.linjingc.notedemo.dao.UserMapper;
import com.linjingc.notedemo.entity.BasicUser;
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
            userMapper.insert("小明" + i, "123456", i);
        }
    }


}
