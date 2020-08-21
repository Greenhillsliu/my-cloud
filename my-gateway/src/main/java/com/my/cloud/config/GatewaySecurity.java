package com.my.cloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 〈功能概述〉<br>
 *
 * @className: GatewaySecurity
 * @package: com.my.cloud.config
 * @author: liu
 * @date: 2020/8/18 10:16
 */
@Configuration
@EnableWebSecurity
public class GatewaySecurity extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.requestMatchers().anyRequest().and().authorizeRequests().antMatchers("/oauth/**").permitAll();
    }
}
