package com.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * properties 配置
 */
@Component
@ConfigurationProperties(prefix = "author")
@PropertySource("classpath:config/author.properties")
public class AuthorSettings {

    private String name;

    private String age;


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
