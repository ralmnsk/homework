package com.github.ralmnsk.homework.beans;

import com.github.ralmnsk.homework.bean.postprocessor.AnnotationAnalyzer;
import com.github.ralmnsk.homework.bean.postprocessor.Application;
import com.github.ralmnsk.homework.bean.postprocessor.RenderImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

//@SpringBootConfiguration
@SpringBootTest
public class AppAnnotationAnalyzerTest {

    @Test
    void analyzerTest(){
        ApplicationContext ctx= new AnnotationConfigApplicationContext(Application.class);
        Map<String, Object> map = ctx.getBeansOfType(Object.class);
        List<Object> list=new ArrayList<>();
        for (Map.Entry<String,Object> entry:map.entrySet()) {
            list.add(entry.getValue());
        }

        List<List<Method>> collect = list.stream()
                .map(o -> o.getClass())
                .map(c -> (new AnnotationAnalyzer()).analyze(c))
                .filter(l -> l.size() > 0)
                .collect(Collectors.toList());
        assertEquals(collect.get(0).get(0).getName(),"action");
    }
}
