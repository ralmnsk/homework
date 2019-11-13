package com.github.ralmnsk.homework.property.injection;


public class ViewerImpl implements  Viewer{

    private String str;

    public ViewerImpl(String str){
        this.str=str;
    }

    public ViewerImpl() {
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void show() {
        System.out.println("Show this string:"+str);
    }
}
