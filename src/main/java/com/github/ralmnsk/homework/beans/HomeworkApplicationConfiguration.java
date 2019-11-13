package com.github.ralmnsk.homework.beans;

import com.github.ralmnsk.homework.beans.BeanConfiguration;
import com.github.ralmnsk.homework.beans.MessageVIsualizator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class HomeworkApplicationConfiguration {

	public static void main(String[] args) {
//		SpringApplication.run(HomeworkApplication.class, args);
		ApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfiguration.class);
		MessageVIsualizator m=(MessageVIsualizator)ctx.getBean("messageVIsualizatorSecond");
		m.view();
		
	}

}
