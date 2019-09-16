package com.linjingc.mybaitissourcecodedemo.entity;

import lombok.Data;
import lombok.ToString;

/**
 * 用户类
 *
 * @author cxc
 */
@Data
@ToString
public class BasicUser {
    private Long id;
    private String name;
    private Integer age;
    private String textNode;
}
