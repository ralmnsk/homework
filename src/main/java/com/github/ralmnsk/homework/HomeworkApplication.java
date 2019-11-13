package com.github.ralmnsk.homework;

import com.github.ralmnsk.homework.beans.MessageVIsualizator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class HomeworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(HomeworkApplication.class, args);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		MessageVIsualizator m=(MessageVIsualizator)ctx.getBean("visualizator");
		m.view();

	}

}
