package com.linjingc.mybaitisplusdemo.controller;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.linjingc.mybaitisplusdemo.entity.BasicUser;
import com.linjingc.mybaitisplusdemo.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/{name}")
    public BasicUser findUser(@PathVariable String name) {
        return userService.findUser(name);
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        userService.saveUser();
        return "保存成功";
    }


    /**
     * 分页查询
     * @param page 页数
     * @param pagesize 单页数量
     * @return
     */
    @RequestMapping("/pageFindUser/{page}/{pagesize}")
    @ResponseBody
    public String pageFindUser(@PathVariable Long page,@PathVariable Long pagesize) {
        Page<BasicUser> basicUserPage = new Page<>();
        //页数 0和1的效果一样 从1选择
        basicUserPage.setCurrent(page);
        //单页显示数量
        basicUserPage.setSize(pagesize);

        //排序操作
        OrderItem orderItem=new OrderItem().setAsc(true).setColumn("age");
        List<OrderItem> list=new ArrayList<OrderItem>();
        list.add(orderItem);
        basicUserPage.setOrders(list);
        List<BasicUser> basicUsers = userService.pageFindUser(basicUserPage);
        return basicUsers.toString();
    }

}
