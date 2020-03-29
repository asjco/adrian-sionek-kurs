package com.course.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

    public void exterminate(ArrayList<Integer> numbers){

        for(int i = 0; i < numbers.size(); i++){

            numbers.get(i);

            if(numbers.get(i) % 2 == 0){
                evenNumbers.add(i);
            }
        }
    }

}
