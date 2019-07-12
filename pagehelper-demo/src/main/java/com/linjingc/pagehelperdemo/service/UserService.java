package com.linjingc.pagehelperdemo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.linjingc.pagehelperdemo.dao.UserMapper;
import com.linjingc.pagehelperdemo.entity.BasicUser;
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
     * PageHelper分页查询全部
     *
     * @param page
     * @param pageSize
     */
    public List<BasicUser> getAll(int page, int pageSize) {
        //这里就是分页了
        PageHelper.startPage(page, pageSize);

        PageInfo<BasicUser> userPageInfo = new PageInfo<>(userMapper.getAll());

        List<BasicUser> list = userPageInfo.getList();

        return list;
    }


}
