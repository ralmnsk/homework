package com.github.ralmnsk.homework.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.github.ralmnsk.homework")
public class RendererFieldApp {
    public static void main(String[] a) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(RendererFieldApp.class);
        RendererField rf=ctx.getBean(RendererField.class);
        rf.getMv().view();
    }
}
