package com.github.ralmnsk.homework.list.beans.injection;

import com.github.ralmnsk.homework.beans.MessageVIsualizator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ListBeanInjection {
    private List<MessageVIsualizator> list;

    public ListBeanInjection(@Autowired List<MessageVIsualizator> list){
        this.list=list;
    }

    public void view(){
        list.stream().forEach(m->m.view());
    }
}
