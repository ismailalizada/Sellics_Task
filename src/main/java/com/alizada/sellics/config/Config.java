package com.alizada.sellics.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
    @Bean
    RestOperations restOperations(){
        return new RestTemplate();
    }

}

