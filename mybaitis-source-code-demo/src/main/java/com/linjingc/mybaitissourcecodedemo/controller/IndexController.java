package com.linjingc.mybaitissourcecodedemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


	@RequestMapping("/")
	public String index() {
		return "欢迎进入mybaitis源码解析项目";
	}

}
