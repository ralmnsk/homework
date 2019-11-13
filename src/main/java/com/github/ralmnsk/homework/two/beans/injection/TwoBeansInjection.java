package com.github.ralmnsk.homework.two.beans.injection;

import com.github.ralmnsk.homework.beans.MessageVIsualizator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TwoBeansInjection {
    @Autowired
    @Qualifier("messageVisualizatorThird")
    private MessageVIsualizator third;
    @Autowired
    @Qualifier("messageVisualizatorFourth")
    private MessageVIsualizator fourth;

    public TwoBeansInjection(MessageVIsualizator third, MessageVIsualizator fourth) {
        this.third = third;
        this.fourth = fourth;
    }

    public TwoBeansInjection() {
    }

    public MessageVIsualizator getThird() {
        return third;
    }

    public void setThird(MessageVIsualizator third) {
        this.third = third;
    }

    public MessageVIsualizator getFourth() {
        return fourth;
    }

    public void setFourth(MessageVIsualizator fourth) {
        this.fourth = fourth;
    }
}
