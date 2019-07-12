package com.linjingc.mybaitisplusdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.linjingc.mybaitisplusdemo.entity.BasicUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author cxc
 */
@Mapper
public interface UserMapper extends BaseMapper<BasicUser> {
    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    BasicUser findUser(String name);

    @Insert("INSERT INTO USER(NAME, PASSWORD, AGE) VALUES(#{name}, #{password}, #{age})")
    int insert(@Param("name") String name, @Param("password") String password, @Param("age") Integer age);


    /**
     * 分页查询
     * 分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
     * @param page
     * @return
     */
    @Select("SELECT * FROM USER")
    List<BasicUser> pageFindUser(Page<BasicUser> page);

    /**
     * 需要注意的内容
     * #{name} 和${name}的区别    #{}代表自动拼接``  ${}表示需要手动添加``
     */
}
