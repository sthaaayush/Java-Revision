package day2;

import java.util.Scanner;

public class ProjectB {
	public static void main(String[] args) {
		System.out.println("****String Manipulation Tool****");

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter String to play around");
			String userInput = sc.next();

			boolean userProcess = true;
			while (userProcess) {
				System.out.println("\n===========================================");
				System.out.print("Choose your tool: \n1.Uppercase \n2.Lowercase \n3.Length "
						+ "\n4.Starts with \n5.Ends with \n6.Replace \n7.Split \n8.Exit");
				System.out.println("\n===========================================\n");
				int choice = sc.nextInt();

				switch (choice) {
					case 1 -> System.out.println(userInput.toUpperCase());
					case 2 -> System.out.println(userInput.toLowerCase());
					case 3 -> System.out.println(userInput.length());
					case 4 -> {
						System.out.println("Enter to find starts with:");
						String start = sc.next();
						System.out.println(userInput.startsWith(start));
					}
					case 5 -> {
						System.out.println("Enter to find ends with:");
						String end = sc.next();
						System.out.println(userInput.endsWith(end));
					}
					case 6 -> {
						System.out.println("Enter old character:");
						String oldChar = sc.next();
						System.out.println("Enter new character:");
						String newChar = sc.next();
						System.out.println(userInput + " => " + userInput.replace(oldChar, newChar));
					}
					case 7 -> {
						System.out.println("Enter Delimiter:");
						String delimiter = sc.next();
						String[] splitParts = userInput.split(delimiter);
						System.out.println("Parts are:");
						for (String a : splitParts) {
							System.out.println("-> " + a);
						}
					}
					case 8 -> {
						userProcess = false;
					}
				}

			}
		}
	}
}
