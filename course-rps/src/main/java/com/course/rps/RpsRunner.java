package com.course.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        RpsEdit run = new RpsEdit();

        run.inputData();
        run.instructions();
        run.game();
        run.endGame();

    }
}
