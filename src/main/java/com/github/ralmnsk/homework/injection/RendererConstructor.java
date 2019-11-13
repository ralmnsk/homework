package com.github.ralmnsk.homework.injection;

import com.github.ralmnsk.homework.beans.MessageVIsualizator;
import com.github.ralmnsk.homework.beans.MessageVisualizatorThird;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RendererConstructor {

    private MessageVIsualizator mv;

    public MessageVIsualizator getMv() {
        return mv;
    }

    public void setMv(MessageVIsualizator mv) {
        this.mv = mv;
    }

    @Autowired
    public RendererConstructor(MessageVisualizatorThird mv) {
        this.mv = mv;
    }

    public RendererConstructor() {
    }

}
