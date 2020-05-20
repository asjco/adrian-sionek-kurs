package com.course.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Solver {

    public int loopCounter;
    private List<Integer> capabilities = new ArrayList<>();


    public boolean isInRow(int row, int number, SudokuBoard sudokuBoard) {
        boolean result = false;
        for (int i = 0; i < sudokuBoard.SIZE; i++) {
            if (sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(i).getValue() == number) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public boolean isInColumn(int column, int number, SudokuBoard sudokuBoard) {
        boolean result = false;
        for (int i = 0; i < sudokuBoard.SIZE; i++) {
            if (sudokuBoard.getSudokuBoard().get(i).getSudokuRow().get(column).getValue() == number) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public boolean isInSection(int row, int column, int number, SudokuBoard sudokuBoard) {
        boolean result = false;
        int r = row - row % 3;
        int c = column - column % 3;

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (sudokuBoard.getSudokuBoard().get(i).getSudokuRow().get(j).getValue() == number) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean isOk(int row, int column, int number, SudokuBoard sudokuBoard) {
        return !isInRow(row, number, sudokuBoard) && !isInColumn(column, number, sudokuBoard) && !isInSection(row, column, number, sudokuBoard);
    }

/*
    public boolean solver(SudokuBoard sudokuBoard) {
        int row = -1;
        int col = -1;
        boolean isNotEmpty = true;
        loopCounter = 0;

        for (int i = 0; i < sudokuBoard.SIZE; i++) {
            for (int j = 0; j < sudokuBoard.SIZE; j++) {
                if (sudokuBoard.getSudokuBoard().get(i).getSudokuRow().get(j).getValue() == SudokuElement.EMPTY) {
                    row = i;
                    col = j;

                    isNotEmpty = false;
                    break;
                }
            }
            if (!isNotEmpty) {
                break;
            }
        }

        // no empty space left
        if (isNotEmpty) {
            return true;
        }


        for (int number = 1; number <= sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(col).getCapabilities().size(); number++) {
            if (!(isOk(row, col, number, sudokuBoard))) {
                sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(col).removeCapabilitiy(number - 1);
                if (sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(col).getCapabilities().size() == 1) {
                    sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(col).
                            setValue(number);
                    if (solver(sudokuBoard)) {
                        return true;
                    }
                }
            } else if ((isOk(row, col, number, sudokuBoard) && !(sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(col).getCapabilities().size() == 1))) {
                sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(col).setValue(number);
                if (solver(sudokuBoard)) {
                    return true;
                }

            } else if (!(isOk(row, col, number, sudokuBoard)) && sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(col).getCapabilities().size() == 1) {
                System.out.println("Error");
            }
        }
        return false;
    }*/


    public boolean solver2(SudokuBoard sudokuBoard) {
        int row = -1;
        int col = -1;
        boolean isNotEmpty = true;
        loopCounter = 0;

        for (int i = 0; i < sudokuBoard.SIZE; i++) {
            loopCounter++;
            for (int j = 0; j < sudokuBoard.SIZE; j++) {
                if (sudokuBoard.getSudokuBoard().get(i).getSudokuRow().get(j).getValue() == SudokuElement.EMPTY) {
                    row = i;
                    col = j;

                    isNotEmpty = false;
                    break;
                }
            }
            if (!isNotEmpty) {
                break;
            }
        }
        if (isNotEmpty) {
            return true;
        }

        for (int number = 1; number <= 9; number++) {
            if (isOk(row, col, number, sudokuBoard)) {
                sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(col).setValue(number);
                if (solver2(sudokuBoard)) {
                    return true;
                } else {
                    sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(col).setValue(SudokuElement.EMPTY);
                }
            }
        }
        return false;
    }
}
