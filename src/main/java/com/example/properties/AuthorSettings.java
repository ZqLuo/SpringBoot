package com.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * properties 配置
 */
//@Component
//@ConfigurationProperties(prefix = "author") //配置前缀匹配
//@PropertySource("classpath:config/author.properties") //指定文件路径
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
