package days1;

import java.util.Scanner;
import java.util.Random;

public class ProjectA {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random rdNum = new Random(); // Java class to generate random number

            int attemptCount = 1;
            int userGuess = 0;
            int min = 1;
            int max = 10;
            int actualNumber = rdNum.nextInt((max - min) + 1) + min;

            System.out.println("========================================================");
            System.out.println("Guess the number (range from " + min + " to " + max + "):");
            System.out.println("========================================================");

            while (userGuess != actualNumber) {
                System.out.println("========================================================");
                System.out.print("Attempt " + attemptCount + ": Enter your guess (" + min + "-" + max + "): ");
                
                if (sc.hasNextInt()) {
                    userGuess = sc.nextInt();
                    
                    if (userGuess >= min && userGuess <= max) {
                        if (userGuess == actualNumber) {
                            System.out.println("Congratulations!!! " + userGuess + " was the correct guess.\nAttempts: " + attemptCount);
                            break; // Breaks out loop when the guess is correct
                        } else {
                            System.out.println(userGuess + " is a wrong guess! Try again.");
                            System.out.println("========================================================");
                            ++attemptCount;
                        }
                    } else {
                        System.out.println("Guess out of range. Please enter a number between " + min + " and " + max + ".");
                        System.out.println("========================================================");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    System.out.println("========================================================");
                    sc.next(); // Clear invalid input
                }
            }
        }
    }
}
