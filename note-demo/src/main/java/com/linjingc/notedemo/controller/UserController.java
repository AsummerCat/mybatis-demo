package com.linjingc.notedemo.controller;

import com.linjingc.notedemo.entity.BasicUser;
import com.linjingc.notedemo.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/{name}")
    public BasicUser findUser(@PathVariable String name) {
        BasicUser user = userService.findUser(name);

        return user;

    }

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        userService.saveUser();
        return "保存成功";
    }


    @RequestMapping("/deleteAll")
    @ResponseBody
    public String deleteAll() {
        userService.deleteAll();
        return "删除成功";
    }



}
