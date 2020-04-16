package com.linjingc.mybaitissourcecodedemo.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 用户类
 *
 * @author cxc
 */
@Data
@ToString
@Component
public class BasicUser implements InitializingBean {
    private Long id;
    private String name;
    private Integer age;
    private String textNode;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化完成");
    }
}
