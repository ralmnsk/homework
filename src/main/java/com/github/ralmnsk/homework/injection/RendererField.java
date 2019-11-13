package com.github.ralmnsk.homework.injection;

import com.github.ralmnsk.homework.beans.MessageVIsualizator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RendererField {
    @Autowired
    @Qualifier("messageVisualizatorThird")
    private MessageVIsualizator mv;

    public MessageVIsualizator getMv() {
        return mv;
    }

    public void setMv(MessageVIsualizator mv) {
        this.mv = mv;
    }

    public RendererField(MessageVIsualizator mv) {
        this.mv = mv;
    }

    public RendererField() {
    }

}
