package com.course.sudoku;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Integer.parseInt;

public class NumbersValidator {

    Scanner scanner = new Scanner(System.in);
    private int row = 0;
    private int column = 0;
    private int value = 0;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getValue() {
        return value;
    }

    public void scanParameters() {
        System.out.println("Please set parameters from 1 to 9 in this way 'row,column,value' \n(for example 3,3,5 )");
        String scan1 = scanner.nextLine();
        if (!(scan1.length() == 5 && ",".equals(scan1.substring(1, 2)) && ",".equals(scan1.substring(3, 4))
                && isDigit(scan1.charAt(0)) && isDigit(scan1.charAt(2)) && isDigit(scan1.charAt(4))
                && parseInt(scan1.substring(0, 1)) > 0 && parseInt(scan1.substring(2, 3)) > 0 && parseInt(scan1.substring(4, 5)) > 0)) {
            scanParameters();
        } else {
            while (!("1".equals(scan1.substring(0, 1)) || "2".equals(scan1.substring(0, 1)) || "3".equals(scan1.substring(0, 1)) || "4".equals(scan1.substring(0, 1)) ||
                    "5".equals(scan1.substring(0, 1)) || "6".equals(scan1.substring(0, 1)) || "7".equals(scan1.substring(0, 1)) || "8".equals(scan1.substring(0, 1)) ||
                    "9".equals(scan1.substring(0, 1)) ||
                    "1".equals(scan1.substring(2, 3)) || "2".equals(scan1.substring(2, 3)) || "3".equals(scan1.substring(2, 3)) || "4".equals(scan1.substring(2, 3)) ||
                    "5".equals(scan1.substring(2, 3)) || "6".equals(scan1.substring(2, 3)) || "7".equals(scan1.substring(2, 3)) || "8".equals(scan1.substring(2, 3)) ||
                    "9".equals(scan1.substring(2, 3)) ||
                    "1".equals(scan1.substring(4, 5)) || "2".equals(scan1.substring(4, 5)) || "3".equals(scan1.substring(4, 5)) || "4".equals(scan1.substring(4, 5)) ||
                    "5".equals(scan1.substring(4, 5)) || "6".equals(scan1.substring(4, 5)) || "7".equals(scan1.substring(4, 5)) || "8".equals(scan1.substring(4, 5)) ||
                    "9".equals(scan1.substring(4, 5)))) {
                System.out.println("Please set correct params (1 to 9)");
                scan1 = scanner.nextLine();
            }

            row = parseInt(scan1.substring(0, 1));
            column = parseInt(scan1.substring(2, 3));
            value = parseInt(scan1.substring(4, 5));
        }

    }
}
