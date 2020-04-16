package com.course.rps;

import java.util.Random;
import java.util.Scanner;

public final class Rps {

    private final Scanner scanner = new Scanner(System.in);
    private final Random generator = new Random();
    private int rounds = 0;

    public void inputData() {

        System.out.println("What's your name ?");
        String playerName = scanner.nextLine();
        System.out.println("Welcome in game " + "*" + playerName + "*" + "\nPlease tell me, how many rounds you want to win ???");
        rounds = scanner.nextInt();
        System.out.println("Ok, you must win " + rounds + " rounds\n");

    }

    public void instructions() {
        System.out.println("Now please read the instructions:\n" +
                "button 1 - plays *Rock*,\n" +
                "button 2 - plays *Paper*,\n" +
                "button 3 - plays *Scissors*,\n" +
                "button x - ends the game preceded by a question, \"Are you sure to end the game ?\"\n" +
                "button n - restarts the game preceded by a question, \"Are you sure to end actual game ?\"\n");
    }

    public void startGame() {

        int playerPoints = 0;
        int computerPoints = 0;


        boolean end = false;
        while (!end) {

            System.out.println("Please choose your move...");

            int move = scanner.nextInt();
            int computerMove = 0;

            //Player moves
            if (move == 1) {
                System.out.println("Your move - *Rock*");
                computerMove = generator.nextInt(3) + 1;
            } else if (move == 2) {
                System.out.println("Your move - *Paper*");
                computerMove = generator.nextInt(3) + 1;
            } else if (move == 3) {
                System.out.println("Your move - *Scissors*");
                computerMove = generator.nextInt(3) + 1;
            } else {
                System.out.println("Wrong move!!!, choose numbers from 1 to 3");
                continue;
            }


            //Computer moves
            if (computerMove == 1) {
                System.out.println("Computer move - *Rock*");
            } else if (computerMove == 2) {
                System.out.println("Computer move - *Paper*");
            } else if (computerMove == 3) {
                System.out.println("Computer move - *Scissors*");
            }


            //Who is winner ?
            if (move == 1 && computerMove == 1) {
                System.out.println("draw");
            } else if (move == 1 && computerMove == 2) {
                computerPoints++;
                System.out.println("point for computer");

            } else if (move == 1 && computerMove == 3) {
                playerPoints++;
                System.out.println("point for player");

            } else if (move == 2 && computerMove == 2) {
                System.out.println("draw");
            } else if (move == 2 && computerMove == 1) {
                playerPoints++;
                System.out.println("point for player");

            } else if (move == 2 && computerMove == 3) {
                computerPoints++;
                System.out.println("point for computer");

            } else if (move == 3 && computerMove == 3) {
                System.out.println("draw");
            } else if (move == 3 && computerMove == 1) {
                computerPoints++;
                System.out.println("point for computer");

            } else if (move == 3 && computerMove == 2) {
                playerPoints++;
                System.out.println("point for player");

            }

            //Won round
            if (playerPoints > computerPoints) {
                System.out.println("Won rounds = " + playerPoints);
            } else if (playerPoints < computerPoints) {
                System.out.println("Won rounds = " + computerPoints);
            } else {
                System.out.println("Draw for all players with: " + playerPoints + " points");
            }

            //end
            if (playerPoints == rounds || computerPoints == rounds) {
                end = true;
            }
        }

        //final scores
        System.out.println("Final score: Player = " + playerPoints + " points, Computer = " + computerPoints + " points");

        if (playerPoints > computerPoints) {
            System.out.println("The winner is Player with " + playerPoints + " points");
        } else if (playerPoints < computerPoints) {
            System.out.println("The winner is Computer with " + computerPoints + " points");
        }


    }

    public void endGame() {
        System.out.println("To quit press *x*,\nTo close actual game and start new round press *n* ");

        scanner.nextLine();
        String dec1 = scanner.nextLine();

        System.out.println(dec1);
        if ("x".equals(dec1)) {
            System.out.println("Are you sure to quit ?");
            String dec2 = scanner.nextLine();
            if ("".equals(dec2)) {
                System.out.println("Thanks for playing");
                System.exit(0);
            } else {
                inputData();
                instructions();
                startGame();
                endGame();
            }

        } else if ("n".equals(dec1)) {
            System.out.println("Are you sure to close actual game, and start the new round ?");

            String dec2 = scanner.nextLine();
            if ("".equals(dec2)) {
                System.out.println("New round");
                inputData();
                instructions();
                startGame();
                endGame();
            } else {
                System.exit(0);
            }
        }

    }


}
