package com.github.ralmnsk.homework.bean.postprocessor;

import org.springframework.stereotype.Component;

@Component
public class RenderImplSecond implements Render{


    @Override
    public void action() {
        for (int i=0;i<100;i++){
            String str=" action2:"+i*2;
        }
    }
}
