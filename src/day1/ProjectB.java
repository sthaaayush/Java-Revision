package day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjectB {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("========================================================");
            System.out.println("Java Calculator");
            System.out.println("========================================================");

            long firstNum = 0;
            long secondNum = 0;
            byte choice = 0;

            try {
                System.out.println("Enter numbers to perform operation");
                System.out.print("First Number: ");
                firstNum = sc.nextLong();
                System.out.print("Second Number: ");
                secondNum = sc.nextLong();

                System.out.println("Choose operation: \n1. Add \n2. Subtract \n3. Division \n4. Multiplication ");
                choice = sc.nextByte();

                long result = switch (choice) {
                    case 1 -> firstNum + secondNum;
                    case 2 -> firstNum - secondNum;
                    case 3 -> {
                        if (secondNum == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                            yield 0; // Use `yield` to return value from switch expression
                        }
                        yield firstNum / secondNum;
                    }
                    case 4 -> firstNum * secondNum;
                    default -> {
                        System.out.println("Invalid operation choice.");
                        yield 0;
                    }
                };

                if (result != 0) {
                    System.out.println("Result: " + result);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid numbers.");
            }
        }
    }
}
