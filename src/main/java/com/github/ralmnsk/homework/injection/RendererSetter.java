package com.github.ralmnsk.homework.injection;

import com.github.ralmnsk.homework.beans.MessageVIsualizator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RendererSetter {

    private MessageVIsualizator mv;

    public MessageVIsualizator getMv() {
        return mv;
    }

    @Autowired
    @Qualifier("messageVisualizatorThird")
    public void setMv(MessageVIsualizator mv) {
        this.mv = mv;
    }

    public RendererSetter(MessageVIsualizator mv) {
        this.mv = mv;
    }

    public RendererSetter() {
    }

}
