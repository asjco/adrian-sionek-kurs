package com.course.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Solver {

    public int loopCounter;
    private List<Integer> capabilities = new ArrayList<>();

    public Solver() {
        for (int i = 0; i < 9; i++)
            capabilities.add(i, i + 1);
    }

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


    public void solver(SudokuBoard sudokuBoard) {
        loopCounter = 0;
        for (int row = 0; row < sudokuBoard.SIZE; row++) {
            for (int column = 0; column < sudokuBoard.SIZE; column++) {
                if (sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(column).getValue() == SudokuElement.EMPTY) {
                    for (int number = 1; number <= 9; number++) {
                        if (!(isOk(row, column, number, sudokuBoard))) {
                            sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(column).removeCapabilitiy(number - 1);
                            if (sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(column).getCapabilities().size() == 1) {
                                sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(column).
                                        setValue(sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(column).getCapabilities().get(0));
                            }
                        } else if ((isOk(row, column, number, sudokuBoard) && !(sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(column).getCapabilities().size() == 1))) {
                            sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(column).setValue(number);
                        } else if (!(isOk(row, column, number, sudokuBoard)) && sudokuBoard.getSudokuBoard().get(row).getSudokuRow().get(column).getCapabilities().size() == 1) {
                            System.out.println("Error");
                        }
                    }

                }

            }
            loopCounter++;
        }
    }


}
