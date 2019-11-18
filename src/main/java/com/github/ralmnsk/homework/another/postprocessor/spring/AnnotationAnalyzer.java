package com.github.ralmnsk.homework.another.postprocessor.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
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
            Method[] methods=beanClass.getMethods();
            for (Method m : methods) {
                if (m.isAnnotationPresent(Postproc.class)) {
                    return Proxy.newProxyInstance(beanClass.getClassLoader(), beanClass.getInterfaces(), new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                                long start=System.nanoTime();
                                Object o=method.invoke(bean,args);
                                long stop=System.nanoTime();
                                System.out.println(method.getName()+" time:"+(stop-start));
                            return o;
                        }
                    });
                }
            }
        }
        return bean;
    }
}
