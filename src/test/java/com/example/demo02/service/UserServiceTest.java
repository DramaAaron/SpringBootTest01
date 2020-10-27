package com.example.demo02.service;

import com.example.demo02.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    void listAllUser() {
        System.out.println("测试列出所有用户");
        List<User> list = this.userService.listAllUser();
        for(User user : list){
            System.out.println(user.toString());

        }
    }

    @Test
    void getUser() {
        System.out.println("测试查询id对应用户");
        User user = this.userService.getUser((long)5);
        System.out.println(user.toString());

    }

    @Test
    void createUser() {
        System.out.println("测试创建用户");
        User user = new User();
        user.setId((long)8);
        user.setName("ceshi");
        user.setMobile("000000");
        user.setEmail("00000@email");
        userService.createUser(user);

    }

    @Test
    void deleteUser() {
        System.out.println("测试删除id对应用户");
        userService.deleteUser((long)8);
    }
}