package com.course.rps;

import java.util.InputMismatchException;

public class RpsRunner {

    public static void main(String[] args) {

        RpsCheat run = new RpsCheat();

        try {
            run.inputData();
        } catch (InputMismatchException e) {
            System.out.println("Wrong rounds quantity " + e);
        }

        run.instructions();

        try {
            run.game();
        } catch (InputMismatchException e) {
            System.out.println("Wrong player move " + e);
        }

        try {
            run.endGame();
        } catch (InputMismatchException e) {
            System.out.println("Something went wrong " + e);
        }


    }
}
