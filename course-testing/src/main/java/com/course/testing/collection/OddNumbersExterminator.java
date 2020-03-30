package com.course.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {



    public Integer exterminate(ArrayList<Integer> numbers){

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for(int i = 0; i < numbers.size(); i++){

            Integer numb = numbers.get(i);

            if(numb % 2 == 0){
                evenNumbers.add(numb);
            }
        }
        return evenNumbers.size();
    }

}
