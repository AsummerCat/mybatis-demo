package com.linjingc.notedemo.dao;

import com.linjingc.notedemo.entity.BasicUser;
import org.apache.ibatis.annotations.*;

/**
 * @author cxc
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    BasicUser findUser(String name);

    @Insert("INSERT INTO USER(NAME, PASSWORD, AGE) VALUES(#{name}, #{password}, #{age})")
    int insert(@Param("name") String name, @Param("password") String password, @Param("age") Integer age);

    @Delete("DELETE FROM USER")
    void deleteAll();
    /**
     * 需要注意的内容
     * #{name} 和${name}的区别    #{}代表自动拼接``  ${}表示需要手动添加``
     */
}
