package com.github.ralmnsk.homework.bean.postprocessor;

import com.github.ralmnsk.homework.property.injection.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

@Configuration
@ComponentScan("com.github.ralmnsk.homework.bean.postprocessor")
public class Postprocessor {
    @Autowired
    @Qualifier("Postproc")
    private Method method;

    @Bean
    public void proc(){
        System.out.println(method.getDeclaringClass());
    }

}
