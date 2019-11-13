package com.github.ralmnsk.homework.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public MessageVIsualizator messageVIsualizatorSecond(){
        return new MessageVIsualizatorSecond();
    }
}
