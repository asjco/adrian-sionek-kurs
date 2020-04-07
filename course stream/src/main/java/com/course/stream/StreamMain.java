package com.course.stream;

import com.course.stream.beautifier.PoemBeautifier;
import com.course.stream.lambda.*;
import com.course.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args){
        System.out.println("Welcome to module 7 - Stream ");

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("example 1", string -> "ABC " + string + " ABC");
        poemBeautifier.beautify("example 2", string -> string.toUpperCase());
        poemBeautifier.beautify("example 3", string -> "*** "+string+" ***");
        poemBeautifier.beautify("example 4", string -> "<3 "+string+" <3");
    }


}
