package com.github.ralmnsk.homework.bean.postprocessor;

import org.springframework.stereotype.Component;

@Component
public class RenderImpl implements Render{

    public RenderImpl() {
    }

    @Postproc
    @Override
    public void action() {
        for (int i=0;i<1000;i++){
            String str=" action:"+i*2;
        }
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
