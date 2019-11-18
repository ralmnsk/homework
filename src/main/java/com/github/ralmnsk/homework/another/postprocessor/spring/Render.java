package com.github.ralmnsk.homework.another.postprocessor.spring;

import org.springframework.stereotype.Component;

@Component
public class Render implements Ren{

    public Render() {
    }

    @Postproc
    @Override
    public void action() {
        for (int i=0;i<1000000;i++){
            String str=" action:"+i*2;
        }
        System.out.println("action testing method");
    }


    public void actionSecond() {
        for (int i=0;i<1000;i++){
            String str=" actionSecond:"+i*2;
        }
    }

    public void actionThird() {
        for (int i=0;i<1000;i++){
            String str=" actionThird:"+i*2;
        }
    }
}
