package com.linjingc.pagehelperdemo.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 分页插件配置文件
 * 将该类加到spring容器里
 * pageHelper
 * @Link https://pagehelper.github.io/docs/howtouse/ 官网文档地址
 */
@Configuration
public class PageHelperConfig {
    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();

        properties.setProperty("offsetAsPageNum", "true");
        properties.setProperty("rowBoundsWithCount", "true");
        properties.setProperty("reasonable", "true");
        properties.setProperty("dialect", "h2");
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}