package com.example.demo02;

import com.example.demo02.model.User;
import com.example.demo02.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@WebAppConfiguration
class Demo02ApplicationTests {
//    @Before
//    public void init() {
//        System.out.println("开始测试-----------------");
//    }

    @Autowired
    private UserService userService;

    @Test
    void test01() {
        System.out.println("测试查询id对应用户");
        User user = this.userService.getUser((long)5);
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getMobile());

    }


}
