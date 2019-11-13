package com.github.ralmnsk.homework.two.beans.injection;

import com.github.ralmnsk.homework.injection.RendererSetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.github.ralmnsk.homework")
public class TwoBeansInjectionApp {
    public static void main(String[] a) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TwoBeansInjectionApp.class);
        TwoBeansInjection injection=ctx.getBean(TwoBeansInjection.class);
        injection.getFourth().view();
        injection.getThird().view();
    }
}
