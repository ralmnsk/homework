package com.github.ralmnsk.homework.bean.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;

public class Application {
    public static void main(String...a){
            ApplicationContext ctx= new AnnotationConfigApplicationContext(Postprocessor.class);
            Method method=(Method)ctx.getBean("proc",Method.class);
    }
}
