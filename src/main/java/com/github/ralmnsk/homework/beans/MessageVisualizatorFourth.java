package com.github.ralmnsk.homework.beans;

import org.springframework.stereotype.Component;

@Component
public class MessageVisualizatorFourth implements MessageVIsualizator {
    @Override
    public void view() {
        System.out.println("Message four");
    }
}
