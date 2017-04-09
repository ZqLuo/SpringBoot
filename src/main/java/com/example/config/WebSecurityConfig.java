package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 权限控制
 */
//@Configuration
//@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/","login").permitAll() //对／和login不拦截
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login") //设置登录页面访问路径
                .defaultSuccessUrl("/chat") //登录成功后的跳转路径
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    //在内存中配置用户
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("u1").password("u1").roles("USER")
                .and()
                .withUser("u2").password("u2").roles("USER");
    }

    //静态资源不拦截
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/static/**");
    }
}
