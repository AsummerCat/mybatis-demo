package com.linjingc.mybaitissourcecodedemo.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		List<String> beanNames = Stream.of(beanFactory.getBeanDefinitionNames()).collect(Collectors.toList());
		String name = beanNames.stream().filter(e -> e.equals("basicUser")).collect(Collectors.joining());

		//从BeanFactory获取到Bean定义
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
		//获取属性
		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		// MutablePropertyValues如果设置了相关属性，可以修改，如果没有设置则可以添加相关属性信息
		propertyValues.add("name", "1111");
		System.out.println("修改了属性信息");
	}
}
