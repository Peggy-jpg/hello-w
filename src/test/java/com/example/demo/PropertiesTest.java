package com.example.demo;

import com.example.demo.pojo.dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertiesTest {
    @Autowired
    private User user;
    @Test
    public void test01(){
        String username = user.getUsername();
        System.out.println(username);
        System.out.println(user);
    }

}
