package com.github.ralmnsk.homework.beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class HomeworkApplicationXml {

	public static void main(String[] args) {
//		SpringApplication.run(HomeworkApplicationXml.class, args);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		MessageVIsualizator m=(MessageVIsualizator)ctx.getBean("visualizator");
		m.view();

	}

}
