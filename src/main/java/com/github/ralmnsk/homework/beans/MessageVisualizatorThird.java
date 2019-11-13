package com.github.ralmnsk.homework.beans;

import org.springframework.stereotype.Component;

@Component
public class MessageVisualizatorThird implements MessageVIsualizator {
    @Override
    public void view() {
        System.out.println("Message three");
    }
}
