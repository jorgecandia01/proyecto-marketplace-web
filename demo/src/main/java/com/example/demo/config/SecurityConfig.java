package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {


        http
        .csrf().disable()
		.authorizeRequests()
        .antMatchers("/resources/**", "/login/**", "/login*", "/api/v1/user/**", "/resources/database/**").permitAll()
        //.anyRequest().authenticated()
        .and()
        .formLogin(login -> login
            .loginPage("/login.html")
            .permitAll()
        )
		.httpBasic()
        .and()
        .logout()
        .logoutUrl("/logout");
    }
}