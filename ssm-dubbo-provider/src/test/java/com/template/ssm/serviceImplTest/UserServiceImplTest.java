package com.template.ssm.serviceImplTest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sunveee.template.model.User;
import com.sunveee.template.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class UserServiceImplTest {
    @Resource
    private UserService userService;

    @Test
    public void getUser() {
        User user = userService.getUserById(1);
        System.out.println(user.getName());
    }

}