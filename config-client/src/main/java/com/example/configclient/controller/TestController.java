package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈功能概述〉<br>
 *
 * @className: TestController
 * @package: com.example.configclient.controller
 * @author: liu
 * @date: 2020/8/14 9:42
 */
@RestController
@RequestMapping("test")
@RefreshScope
public class TestController {
    @Value("${bussiness.name}")
    private String s;

    @GetMapping
    public String test(){
        return s;
    }
}
