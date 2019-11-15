package com.github.ralmnsk.homework.bean.postprocessor.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan("com.github.ralmnsk.homework.bean.postprocessor.spring")
public class Application {

    public static void main(String...a){
        ApplicationContext ctx= new AnnotationConfigApplicationContext(Application.class);
        AnnotationAnalyzer analyzer = ctx.getBean(AnnotationAnalyzer.class);

    }
}
