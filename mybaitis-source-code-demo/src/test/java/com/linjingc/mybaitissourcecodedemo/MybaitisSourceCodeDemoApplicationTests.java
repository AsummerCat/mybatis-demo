package com.linjingc.mybaitissourcecodedemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybaitisSourceCodeDemoApplicationTests {

	@Autowired
	private com.linjingc.hello.service.HelloService helloService;

	@Test
	public void contextLoads() {
		System.out.println(helloService.heelloWord());
	}

}
