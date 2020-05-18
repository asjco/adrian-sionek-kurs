package com.course.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuBoard extends Prototype {

    Scanner scanner = new Scanner(System.in);
    NumbersValidator numbersValidator = new NumbersValidator();
    public static final int SIZE = 9;
    private List<SudokuRow> sudokuBoard = new ArrayList<>();


    public List<SudokuRow> getSudokuBoard() {
        return sudokuBoard;
    }

    public void addRowToBoard(int index, SudokuRow row) {
        sudokuBoard.add(index, row);
    }

    public void createBoard() {
        for (int i = 0; i < 9; i++) {
            addRowToBoard(i, new SudokuRow());
            for (int j = 0; j < 9; j++) {
                getSudokuBoard().get(i).addElementToRow(j, new SudokuElement(SudokuElement.EMPTY));
            }
        }
    }

    public void setElement() {
        boolean end = false;
        System.out.println(this.toString());
        numbersValidator.scanParameters();
        getSudokuBoard().get(numbersValidator.getRow() - 1).getSudokuRow().get(numbersValidator.getColumn() - 1).setValue(numbersValidator.getValue());
        System.out.println(this.toString());
        while (!end) {
            System.out.println("If you want to set more numbers, put 'enter'");
            String scan = scanner.nextLine();
            if ("".equals(scan)) {
                numbersValidator.scanParameters();
                getSudokuBoard().get(numbersValidator.getRow() - 1).getSudokuRow().get(numbersValidator.getColumn() - 1).setValue(numbersValidator.getValue());
                System.out.println(this.toString());
            } else {
                end = true;
            }
        }
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedBoard = (SudokuBoard) super.clone();
        clonedBoard.sudokuBoard = new ArrayList<>();
        for(SudokuRow row : sudokuBoard) {
            SudokuRow clonedRow = new SudokuRow();
            for(SudokuElement element : row.getSudokuRow()) {
                clonedRow.getSudokuRow().add(new SudokuElement(element.getValue()));
            }
            clonedBoard.getSudokuBoard().add(clonedRow);
        }
        return clonedBoard;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int element = getSudokuBoard().get(i).getSudokuRow().get(j).getValue();
                if (element >= 0) {
                    result += "| " + element;
                } else {
                    result += "|" + element;
                }
            }
            result += "|\n";
        }
        return result;
    }


}