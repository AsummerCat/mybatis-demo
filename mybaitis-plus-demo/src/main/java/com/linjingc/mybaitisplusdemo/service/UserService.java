package com.linjingc.mybaitisplusdemo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.linjingc.mybaitisplusdemo.dao.UserMapper;
import com.linjingc.mybaitisplusdemo.entity.BasicUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    /**
     * 分页查询
     */
    public List<BasicUser> pageFindUser(Page<BasicUser> page) {
        return userMapper.pageFindUser(page);
    }

}
