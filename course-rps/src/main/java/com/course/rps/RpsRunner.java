package com.course.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        RpsEdit game = new RpsEdit();

        game.inputData();
        game.instructions();
        game.startGame();
        game.endGame();
        game.finalScore();

    }
}
