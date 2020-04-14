package com.linjingc.mybaitissourcecodedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@MapperScan("com.linjingc.mybaitissourcecodedemo.dao")
@SpringBootApplication
public class MybaitisSourceCodeDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MybaitisSourceCodeDemoApplication.class, args);
		Arrays.stream(run.getBeanDefinitionNames()).forEach(System.out::println);
//		String resource = "mybatis-config.xml";
//		InputStream inputStream = null;
//		try {
//			inputStream = Resources.getResourceAsStream(resource);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//		mapper.findUser("小明");
//	List list = sqlSession.selectList("com.foo.bean.BlogMapper.queryAllBlogInfo");

	}

}
