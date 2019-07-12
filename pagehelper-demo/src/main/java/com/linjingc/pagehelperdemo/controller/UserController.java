package com.linjingc.pagehelperdemo.controller;

import com.linjingc.pagehelperdemo.entity.BasicUser;
import com.linjingc.pagehelperdemo.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/{name}")
    public BasicUser findUser(@PathVariable String name) {
        return userService.findUser(name);
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        userService.saveUser();
        return "保存成功";
    }

    /**
     * 分页查询
     *
     * @param page     页数
     * @param pagesize 单页数量
     * @return
     */
    @RequestMapping("/pageFindUser/{page}/{pagesize}")
    @ResponseBody
    public String pageFindUser(@PathVariable Integer page, @PathVariable Integer pagesize) {
        List<BasicUser> all = userService.getAll(page, pagesize);
        return all.toString();
    }

}
