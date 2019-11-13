package com.github.ralmnsk.homework.bean.postprocessor;

import org.springframework.stereotype.Component;

@Component
public class RenderImpl implements Render{

    @Postproc
    @Override
    public void action() {
        for (int i=0;i<100;i++){
            String str=" action:"+i*2;
        }
    }
}
