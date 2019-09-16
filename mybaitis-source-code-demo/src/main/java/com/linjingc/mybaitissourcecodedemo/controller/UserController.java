package com.linjingc.mybaitissourcecodedemo.controller;

import com.linjingc.mybaitissourcecodedemo.entity.BasicUser;
import com.linjingc.mybaitissourcecodedemo.service.UserService;
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
		return userService.findUser(name);
	}

	@RequestMapping("/save")
	@ResponseBody
	public String save() {
		userService.saveUser();
		return "保存成功";
	}

}
