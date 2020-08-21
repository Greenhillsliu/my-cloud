package com.my.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 〈功能概述〉<br>
 *
 * @className: GatewayApplication
 * @package: com.my.cloud
 * @author: liu
 * @date: 2020/8/18 10:02
 */
@SpringCloudApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }
}
