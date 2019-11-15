package com.github.ralmnsk.homework.bean.postprocessor.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AnnotationAnalyzer implements BeanPostProcessor {

    private Map<String, Class> map = new HashMap<String, Class>();
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();
        List<Method> list=new ArrayList<>();
        Method[] methods = beanClass.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Postproc.class)) {
                if(!map.containsKey(beanName)){
                    map.put(beanName, beanClass);
                }
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class beanClass = map.get(beanName);
        if (beanClass!=null){
            //--------------------------------
            List<Method> list=new ArrayList<>();
            Method[] methods = beanClass.getMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(Postproc.class)) {
                    try{
                        method.setAccessible(true);

                        long startTime = System.currentTimeMillis();
                        System.out.println(method.toString()+" start");
                        method.invoke(bean);//.invoke(obj);
                        long stopTime = System.currentTimeMillis();
                        long elapsedTime = stopTime - startTime;
                        System.out.println(method.toString()+" execution time:"+elapsedTime);
                        list.add(method);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
            //return list;
            //--------------------------------
        }
        return bean;
    }
}
