package com.course.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {

    public static final int EMPTY = -1;
    private int value;
    private final List<Integer> capabilities = new ArrayList<>();

    public SudokuElement(int value) {
        this.value = value;
        for (int i = 0; i < 9; i++) {
            capabilities.add(i, i + 1);
        }
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getCapabilities() {
        return capabilities;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void removeCapabilitiy(int index) {
        capabilities.remove(index);
    }

}
