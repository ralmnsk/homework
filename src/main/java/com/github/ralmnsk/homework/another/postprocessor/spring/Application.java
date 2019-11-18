package com.github.ralmnsk.homework.another.postprocessor.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Proxy;
import java.util.Arrays;

@Configuration
@ComponentScan("com.github.ralmnsk.homework.another.postprocessor.spring")
public class Application {

    public static void main(String...a) throws InterruptedException {
        ApplicationContext ctx= new AnnotationConfigApplicationContext(Application.class);
        while(true){
            Thread.sleep(500);
            ctx.getBeansOfType(Ren.class).entrySet().stream().forEach(r->r.getValue().action());
        }
    }
}
