package com.github.ralmnsk.homework.bean.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan("com.github.ralmnsk.homework.bean.postprocessor")
public class Application {

    public static void main(String...a){
            ApplicationContext ctx= new AnnotationConfigApplicationContext(Application.class);
        Map<String, Object> map = ctx.getBeansOfType(Object.class);
        List<Object> list=new ArrayList<>();
        for (Map.Entry<String,Object> entry:map.entrySet()) {
            list.add(entry.getValue());
        }
        list.stream().map(o->o.getClass()).forEach(c->(new AnnotationAnalyzer()).analyze(c));
        //System.out.println(map);
    }
}
