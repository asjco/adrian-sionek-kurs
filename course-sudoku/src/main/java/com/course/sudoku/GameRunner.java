package com.course.sudoku;

import java.util.List;

public class GameRunner {
    public static void main(String[] args) {

        SudokuBoard sudokuBoard = new SudokuBoard();
        Solver solver = new Solver();
        sudokuBoard.createBoard();
        System.out.println(sudokuBoard);

        SudokuBoard deepCloned = null;
        try {
            deepCloned = sudokuBoard.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        sudokuBoard.setElement();
        solver.solver(sudokuBoard);
        System.out.println(sudokuBoard);
        System.out.println(solver.loopCounter);


    }


}
