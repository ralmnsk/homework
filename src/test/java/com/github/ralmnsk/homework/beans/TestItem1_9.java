package com.github.ralmnsk.homework.beans;

import com.github.ralmnsk.homework.injection.*;
import com.github.ralmnsk.homework.list.beans.injection.ListBeanInjection;
import com.github.ralmnsk.homework.list.beans.injection.ListBeanInjectionApp;
import com.github.ralmnsk.homework.property.injection.Config;
import com.github.ralmnsk.homework.property.injection.Viewer;
import com.github.ralmnsk.homework.property.injection.ViewerImpl;
import com.github.ralmnsk.homework.two.beans.injection.TwoBeansInjection;
import com.github.ralmnsk.homework.two.beans.injection.TwoBeansInjectionApp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootConfiguration
@SpringBootTest
class TestItem1_9 {

    @Test
    void viewBeanXml() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        final MessageVIsualizator bean = context.getBean(MessageVisualizatorImpl.class);
        bean.view();
        assertTrue(bean!=null);
        assertTrue(bean.getClass().equals(MessageVisualizatorImpl.class));
    }

    @Test
    void viewBeanConfiguration() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (BeanConfiguration.class);
        final MessageVIsualizator bean = context.getBean(MessageVIsualizatorSecond.class);
        bean.view();
        assertTrue(bean!=null);
        assertTrue(bean.getClass().equals(MessageVIsualizatorSecond.class));
    }

    @Test
    void viewBeanAnnotationConfiguration(){
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (HomeworkApplicationAnnotation.class);
        final MessageVIsualizator bean = context.getBean(MessageVisualizatorThird.class);
        bean.view();
        assertTrue(bean!=null);
        assertTrue(bean.getClass().equals(MessageVisualizatorThird.class));
    }

    @Test
    void beanConstructorInjection(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(RendererConstructorApp.class);
        RendererConstructor rf=ctx.getBean(RendererConstructor.class);
        rf.getMv().view();
        assertTrue(rf!=null);
        assertTrue(rf.getClass().equals(RendererConstructor.class));
    }

    @Test
    void beanFieldInjection(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(RendererFieldApp.class);
        RendererField rf=ctx.getBean(RendererField.class);
        rf.getMv().view();
        assertTrue(rf!=null);
        assertTrue(rf.getClass().equals(RendererField.class));
    }

    @Test
    void beanSetterInjection(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(RendererSetterApp.class);
        RendererSetter rf=ctx.getBean(RendererSetter.class);
        rf.getMv().view();
        assertTrue(rf!=null);
        assertTrue(rf.getClass().equals(RendererSetter.class));
    }

    @Test
    void listBeanInjection(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ListBeanInjectionApp.class);
        ListBeanInjection lbi=ctx.getBean(ListBeanInjection.class);
        lbi.view();
        assertTrue(lbi!=null);
        assertTrue(lbi.getClass().equals(ListBeanInjection.class));
    }

    @Test
    void propertyInjection(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        Viewer viewer=ctx.getBean(ViewerImpl.class);
        viewer.show();
        assertTrue(viewer!=null);
        assertTrue(viewer.getClass().equals(ViewerImpl.class));
    }

    @Test
    void twoBeansInjection(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TwoBeansInjectionApp.class);
        TwoBeansInjection injection=ctx.getBean(TwoBeansInjection.class);
        injection.getFourth().view();
        injection.getThird().view();
        assertTrue(injection!=null);
        assertTrue(injection.getClass().equals(TwoBeansInjection.class));
    }
}