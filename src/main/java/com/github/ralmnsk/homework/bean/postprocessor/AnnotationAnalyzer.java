package com.github.ralmnsk.homework.bean.postprocessor;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class AnnotationAnalyzer {
    public void analyze(Class<?> clazz){
        Method[] methods = clazz.getMethods();

//        Object obj=clazz.getClass().newInstance();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Postproc.class)) {
                try{
                    method.setAccessible(true);

                    long startTime = System.currentTimeMillis();
                    method.invoke(clazz.newInstance());//.invoke(obj);
                    long stopTime = System.currentTimeMillis();
                    long elapsedTime = stopTime - startTime;
                    System.out.println(method.toString()+" execution time:"+elapsedTime);
                } catch (Exception e){
                 e.printStackTrace();
                }
            }
        }
    }
}
