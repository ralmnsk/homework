package com.github.ralmnsk.homework.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.ralmnsk.homework.beans")
//@SpringBootApplication
public class HomeworkApplicationAnnotation {

	public static void main(String[] args) {
//		SpringApplication.run(HomeworkApplicationXml.class, args);
		ApplicationContext ctx=new AnnotationConfigApplicationContext(HomeworkApplicationAnnotation.class);
		MessageVIsualizator m=(MessageVIsualizator)ctx.getBean(MessageVisualizatorThird.class);
		m.view();
		
	}

}
