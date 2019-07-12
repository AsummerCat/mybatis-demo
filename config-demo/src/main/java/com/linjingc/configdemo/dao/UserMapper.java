package com.linjingc.configdemo.dao;

import com.linjingc.configdemo.entity.BasicUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author cxc
 */
@Repository
public interface UserMapper {
    BasicUser findUser(@Param("name") String name);

    int insertUser(@Param("name") String name, @Param("password") String password, @Param("age") Integer age);


    /**
     * 需要注意的内容
     * #{name} 和${name}的区别    #{}代表自动拼接``  ${}表示需要手动添加``
     */

    /**
     * 这是一个很容易忽视的点，记住：接口名与Mybatis的映射文件名一定要一模一样
     */
}
