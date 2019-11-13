package com.github.ralmnsk.homework.property.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String [] a){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        Viewer viewer=ctx.getBean(ViewerImpl.class);
        viewer.show();
    }
}
