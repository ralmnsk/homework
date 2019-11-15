package com.github.ralmnsk.homework.bean.postprocessor.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootConfiguration
@SpringBootTest
class BeanPostProcessorTest {

    @Test
    void analyzerSpringTest(){
        ApplicationContext ctx= new AnnotationConfigApplicationContext(Application.class);
        AnnotationAnalyzer analyzer = ctx.getBean(AnnotationAnalyzer.class);
        assertNotNull(analyzer);
    }

}