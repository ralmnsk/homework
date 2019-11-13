package com.github.ralmnsk.homework.bean.postprocessor;

public class Test { //Only for checking of AnnotationAnalyzer.class
    public static void main(String[] a){
        AnnotationAnalyzer analyzer=new AnnotationAnalyzer();

            analyzer.analyze(RenderImpl.class);

    }
}
