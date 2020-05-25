package com.course.sudoku;

public class GameRunner {
    public static void main(String[] args) {

        SudokuBoard sudokuBoard = new SudokuBoard();
        Solver solver = new Solver();
        sudokuBoard.createBoard();
        System.out.println(sudokuBoard);


        sudokuBoard.setElement();
        solver.solver(sudokuBoard);
        System.out.println(sudokuBoard);
        System.out.println("main loops: " + solver.loopCounter);


    }


}
