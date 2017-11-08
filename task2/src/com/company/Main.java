package com.company;


import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        SecureRandom randomBoat = new SecureRandom();
        boolean[][] Board = new boolean[10][10];
        // int[][] boatLoacation = new int[10][10];
        int boatX = randomBoat.nextInt(10);
        int boatY = randomBoat.nextInt(10);
        Board[boatX][boatY] = true;
        System.out.println("The boat is at " + boatX + " , " + boatY);
        int userGuessX;
        int userGuessY;
        int totalGuess = 0;
        boolean boatLives = true;
        do {
            System.out.println("Please enter X");
            userGuessX = userInput.nextInt();
            System.out.println("Please enter Y");
            userGuessY = userInput.nextInt();
            if (Board[userGuessX][userGuessY] != Board[boatX][boatY]) {
                System.out.println("X = " + userGuessX + "\n" + "Y = " + userGuessY + "\n" + "Miss" + "\n");
                totalGuess++;
            } else {
                System.out.println("X = " + userGuessX + "\n" + "Y = " + userGuessY + "\n" + "Hit!" + "\n" +
                        "It took " + totalGuess + " Guess(es)");
                boatLives = false;
            }

        } while (boatLives);

    }
}
