package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

/**
 * 〈功能概述〉<br>
 *
 * @className: AuthorizationServer
 * @package: org.example.config
 * @author: liu
 * @date: 2020/8/18 10:25
 */
@Configuration
public class AuthorizationServer {

    @Configuration
    @EnableAuthorizationServer
    class ResourceServer extends  AuthorizationServerConfigurerAdapter{
        @Override
        public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
            super.configure(security);
        }

        @Override
        public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
            super.configure(clients);
        }

        @Override
        public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
            super.configure(endpoints);
        }
    }

}
