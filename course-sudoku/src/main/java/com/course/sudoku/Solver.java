package com.course.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Solver {

    public int loopCounter;
    private List<Integer> capabilities = new ArrayList<>();


    public boolean isInRow(int row, int number, SudokuBoard sudokuBoard) {
        for (int i = 0; i < sudokuBoard.SIZE; i++) {
            if (sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(i).getValue() == number) {
                return true;
            }
        }
        return false;
    }

    public boolean isInColumn(int column, int number, SudokuBoard sudokuBoard) {
        for (int i = 0; i < sudokuBoard.SIZE; i++) {
            if (sudokuBoard.getSudokuBoard().get(i).getSudokuRow().get(column).getValue() == number) {
                return true;
            }
        }
        return false;
    }

    public boolean isInSection(int row, int column, int number, SudokuBoard sudokuBoard) {
        int r = row - row % 3;
        int c = column - column % 3;

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (sudokuBoard.getSudokuBoard().get(i).getSudokuRow().get(j).getValue() == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isOk(int row, int column, int number, SudokuBoard sudokuBoard) {
        return !isInRow(row, number, sudokuBoard) && !isInColumn(column, number, sudokuBoard) && !isInSection(row, column, number, sudokuBoard);
    }


    public boolean solver(SudokuBoard sudokuBoard) {
        loopCounter = 0;
        for (int i = 0; i < sudokuBoard.SIZE; i++) {
            loopCounter++;
            for (int j = 0; j < sudokuBoard.SIZE; j++) {
                if (sudokuBoard.getSudokuBoard().get(i).getSudokuRow().get(j).getValue() == SudokuElement.EMPTY) {
                    for (int number = 1; number <= 9; number++) {
                        if (isOk(i, j, number, sudokuBoard)) {
                            sudokuBoard.getSudokuBoard().get(i).getSudokuRow().get(j).setValue(number);
                            if (solver(sudokuBoard)) {
                                return true;
                            } else {
                                sudokuBoard.getSudokuBoard().get(i).getSudokuRow().get(j).setValue(SudokuElement.EMPTY);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


}
