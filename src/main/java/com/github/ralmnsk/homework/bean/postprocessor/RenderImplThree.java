package com.github.ralmnsk.homework.bean.postprocessor;

import org.springframework.stereotype.Component;

@Component
public class RenderImplThree implements Render{


    @Override
    public void action() {
        for (int i=0;i<100000;i++){
            String str=" action3:"+i*2;
        }
    }


    public void actionOther() {
        for (int i=0;i<100;i++){
            String str=" action3.1:"+i*2;
        }
    }
}
