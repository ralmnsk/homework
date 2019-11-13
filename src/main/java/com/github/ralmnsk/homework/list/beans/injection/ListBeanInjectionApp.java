package com.github.ralmnsk.homework.list.beans.injection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.ralmnsk.homework")
public class ListBeanInjectionApp {
    public static void main(String[] a){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ListBeanInjectionApp.class);
        ListBeanInjection lbi=ctx.getBean(ListBeanInjection.class);
        lbi.view();
    }
}
