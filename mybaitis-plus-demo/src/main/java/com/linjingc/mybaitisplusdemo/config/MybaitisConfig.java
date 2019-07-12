package com.linjingc.mybaitisplusdemo.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybaitis配置文件 加入mybaitis-plus
 */
@Configuration
//@MapperScan("com.neo.mapper")
public class MybaitisConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
