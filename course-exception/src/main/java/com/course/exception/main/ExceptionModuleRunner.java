package com.course.exception.main;

import com.course.exception.io.FileReader;
import com.course.exception.io.FileReaderException;
import com.course.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        try{
        fileReader.readFile();}
        catch (FileReaderException e){
            System.out.println("Problem with reading");
        }
    }
}
