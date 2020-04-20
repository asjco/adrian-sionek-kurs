package com.course.rps;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class RpsEdit {

    private final Scanner scanner = new Scanner(System.in);
    private final Random generator = new Random();
    private int rounds;


    public void inputData() throws InputMismatchException {

        System.out.println("What's your name ?");
        String playerName = validName();
        System.out.println("Welcome in game " + "*" + playerName + "*" + "\nPlease tell me, how many rounds you want to win (max 999)???");
        rounds = roundsValidQuantity();
        System.out.println("Ok, you must win " + rounds + " rounds");
    }

    public void instructions() {
        System.out.println("Now please read the instructions:\n" +
                "button 1 - plays *Rock*,\n" +
                "button 2 - plays *Paper*,\n" +
                "button 3 - plays *Scissors*,\n" +
                "button x - ends the game preceded by a question, \"Are you sure to end the game ?\"\n" +
                "button n - restarts the game preceded by a question, \"Are you sure to end actual game ?\"");
    }

    public int playerPoints(int pmove, int cmove) {

        int playerPoints = 0;

        if (pmove == 1 && cmove == 3) {
            playerPoints++;
        } else if (pmove == 2 && cmove == 1) {
            playerPoints++;
        } else if (pmove == 3 && cmove == 2) {
            playerPoints++;
        }
        return playerPoints;
    }

    public int computerPoints(int pmove, int cmove) {

        int computerPoints = 0;

        if (pmove == 1 && cmove == 2) {
            computerPoints++;

        } else if (pmove == 2 && cmove == 3) {
            computerPoints++;

        } else if (pmove == 3 && cmove == 1) {
            computerPoints++;

        }
        return computerPoints;
    }

    public void playerPath(int pmove) {
        if (pmove == 1) {
            System.out.println("Your move - *Rock*");
        } else if (pmove == 2) {
            System.out.println("Your move - *Paper*");
        } else if (pmove == 3) {
            System.out.println("Your move - *Scissors*");
        } else {
            System.out.println("Wrong move!!!, choose numbers from 1 to 3");
        }
    }

    public void computerPath(int cmove) {
        if (cmove == 1) {
            System.out.println("Computer move - *Rock*");
        } else if (cmove == 2) {
            System.out.println("Computer move - *Paper*");
        } else if (cmove == 3) {
            System.out.println("Computer move - *Scissors*");
        }
    }

    public void wonRounds(int playerPoints, int computerPoints) {
        if (playerPoints > computerPoints) {
            System.out.println("Won rounds = " + playerPoints);
        } else if (playerPoints < computerPoints) {
            System.out.println("Won rounds = " + computerPoints);
        } else {
            System.out.println("Draw for all players with: " + playerPoints + " points");
        }
    }

    public void finalScore(int playerPoints, int computerPoints) {
        //final scores
        System.out.println("Final score: Player = " + playerPoints + " points, Computer = " + computerPoints + " points");

        if (playerPoints > computerPoints) {
            System.out.println("The winner is Player with " + playerPoints + " points");
        } else if (playerPoints < computerPoints) {
            System.out.println("The winner is Computer with " + computerPoints + " points");
        }
    }

    public void endGame() throws InputMismatchException {
        System.out.println("To quit press *x*,\nTo close actual game and start new round press *n* ");
        String dec1 = scanner.nextLine();

        System.out.println(dec1);
        if ("x".equals(dec1)) {
            System.out.println("Are you sure to quit ?");
            String dec2 = scanner.nextLine();
            if ("".equals(dec2)) {
                System.out.println("Thanks for playing");
                System.exit(0);
            } else {
                System.out.println("New round");
                inputData();
                instructions();
                game();
                endGame();
            }

        } else if ("n".equals(dec1)) {
            System.out.println("Are you sure to close actual game, and start the new round ?");
            String dec2 = scanner.nextLine();

            if ("".equals(dec2)) {
                System.out.println("New round");
                inputData();
                instructions();
                game();
                endGame();
            } else {
                System.exit(0);
            }
        }
    }

    public String validName() {
        String scan = scanner.nextLine();
        while (!scan.chars().allMatch(Character::isLetter) || scan.length() > 15 || scan.length() < 2 || scan == null) {
            System.out.println("Really ? please tell me your real name...");
            scan = scanner.nextLine();
        }
        return scan;
    }

    public int roundsValidQuantity() {
        String scan = scanner.nextLine();
        while (!scan.chars().allMatch(Character::isDigit) || scan.length() > 3 || scan.length() < 1 || "0".equals(scan)) {
            System.out.println("wrong rounds quantity, try again");
            scan = scanner.nextLine();
        }
        String result = scan;
        return parseInt(result);
    }

    public int playerValidMove() {
        String scan = scanner.nextLine();
        while (!"1".equals(scan) && !"2".equals(scan) && !"3".equals(scan)) {
            System.out.println("wrong move, try again");
            scan = scanner.nextLine();
        }
        String result = scan;
        return parseInt(result);
    }

    public void game() {

        int ppoints = 0;
        int cpoints = 0;

        boolean end = false;
        while (!end) {

            System.out.println("Please choose your move...");

            int pmove = playerValidMove();
            playerPath(pmove);

            int cmove = generator.nextInt(3) + 1;
            computerPath(cmove);

            int pp = playerPoints(pmove, cmove);
            int cp = computerPoints(pmove, cmove);

            if (pp == 1) {
                System.out.println("Point for player");
            } else if (cp == 1) {
                System.out.println("Point for computer");
            } else if (pp == cp) {
                System.out.println("Draw");
            }

            //points
            ppoints = ppoints + pp;

            cpoints = cpoints + cp;

            wonRounds(ppoints, cpoints);

            //end
            if (ppoints == rounds || cpoints == rounds) {
                end = true;
            }
        }
        finalScore(ppoints, cpoints);
    }
}