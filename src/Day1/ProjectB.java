package Day1;

import java.util.Scanner;

public class ProjectB {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("========================================================");
			System.out.println("Java Calculator");
			System.out.println("========================================================");

			System.out.println("Enter numbers to perform operation");
			System.out.print("First Number:");
			long firstNum = sc.nextLong();
			System.out.print("\nSecond Number:");
			long secondNum = sc.nextLong();

			System.out.println("Choose operation: \n1.Add \n2.Subtract \n3.Division \n4.Multiplication ");
			byte choice = sc.nextByte();

			long result = switch (choice) {
			case 1 -> firstNum + secondNum;
			case 2 -> firstNum - secondNum;
			case 3 -> firstNum / secondNum;
			case 4 -> firstNum * secondNum;
			default -> 0;
			};
			
			if (result==0)
				System.out.println("Invalid operation choice");
			else
				System.out.println("Result= " + result);
		}
	}
}
