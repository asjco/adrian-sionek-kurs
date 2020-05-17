package com.course.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private final List<SudokuElement> sudokuRow = new ArrayList<>();



    public void addElementToRow(int index, SudokuElement element) {
        sudokuRow.add(index, element);
    }

    public List<SudokuElement> getSudokuRow() {
        return sudokuRow;
    }



}
