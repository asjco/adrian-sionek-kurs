package com.course.sudoku;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class NumbersValidator {

    Scanner scanner = new Scanner(System.in);


    public int scanRow() {
        System.out.println("Please set row (1 to 9)");
        String scan1 = scanner.nextLine();
        while (!("1".equals(scan1) || "2".equals(scan1) || "3".equals(scan1) || "4".equals(scan1) ||
                "5".equals(scan1) || "6".equals(scan1) || "7".equals(scan1) || "8".equals(scan1) ||
                "9".equals(scan1))) {
            System.out.println("Please set correct row (1 to 9)");
            scan1 = scanner.nextLine();
        }
        return parseInt(scan1);
    }

    public int scanColumn() {
        System.out.println("Please set column (1 to 9)");
        String scan1 = scanner.nextLine();
        while (!("1".equals(scan1) || "2".equals(scan1) || "3".equals(scan1) || "4".equals(scan1) ||
                "5".equals(scan1) || "6".equals(scan1) || "7".equals(scan1) || "8".equals(scan1) ||
                "9".equals(scan1))) {
            System.out.println("Please set correct column (1 to 9)");
            scan1 = scanner.nextLine();
        }
        return parseInt(scan1);
    }

    public int scanValue() {
        System.out.println("Please set value (1 to 9)");
        String scan1 = scanner.nextLine();
        while (!("1".equals(scan1) || "2".equals(scan1) || "3".equals(scan1) || "4".equals(scan1) ||
                "5".equals(scan1) || "6".equals(scan1) || "7".equals(scan1) || "8".equals(scan1) ||
                "9".equals(scan1))) {
            System.out.println("Please set correct value (1 to 9)");
            scan1 = scanner.nextLine();
        }
        return parseInt(scan1);

    }


}
