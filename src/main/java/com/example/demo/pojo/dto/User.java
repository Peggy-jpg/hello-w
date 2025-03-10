package com.example.demo.pojo.dto;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Component
@ConfigurationProperties(prefix = "user")
public class User {
    private int id;
    private String password;
    private String username;
    private Integer age;
    private com.example.springboot_maven.pojo.Book book;
    private Date birth;
    private String[] hobby;
    private List<String> booksName;
    private Map<String, Object> books;
    private Set<Double> salary;
    public User() {
        System.out.println("创建user bean");
    }


}

