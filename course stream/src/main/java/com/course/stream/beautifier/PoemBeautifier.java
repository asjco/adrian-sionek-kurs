package com.course.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String string, PoemDecorator poemDecorator){
         System.out.println(poemDecorator.decorate(string));
    }

}
