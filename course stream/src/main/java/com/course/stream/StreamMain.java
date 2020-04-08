package com.course.stream;

import com.course.stream.beautifier.PoemBeautifier;
import com.course.stream.iterate.NumbersGenerator;
import com.course.stream.lambda.*;
import com.course.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args){
        System.out.println("Using stream to generate numbers from 1 to 20 ");
        NumbersGenerator.generateEven(20);

    }


}
