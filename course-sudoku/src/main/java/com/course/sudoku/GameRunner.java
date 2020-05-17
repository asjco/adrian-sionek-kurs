package com.course.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameRunner {
    public static void main(String[] args) {

        SudokuBoard sudokuBoard = new SudokuBoard();
        sudokuBoard.createBoard();
        System.out.println(sudokuBoard);

        SudokuBoard deepCloned = null;
        try {
            deepCloned = sudokuBoard.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        sudokuBoard.setElement();

        System.out.println(deepCloned);


    }


}
