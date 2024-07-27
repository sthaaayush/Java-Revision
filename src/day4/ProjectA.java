package day4;

import java.io.*;
import java.util.Scanner;

public class ProjectA {
	public static void main(String[] args) {
		System.out.println("****Console File Management System****");
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter Choice of Action:" + "\n1.Create New File" + "\n2.Write to File"
						+ "\n3.Append to File" + "\n4.Read File" + "\n5.Exit");

				int userChoice = sc.nextInt();
				sc.nextLine(); // Consume newline character left by nextInt

				switch (userChoice) {
				// Creating New File
				case 1 -> {
					System.out.println("Enter file name:");
					String fileName = sc.nextLine(); // Use nextLine to read the entire file name
					File file = new File(fileName);
					try {
						if (file.createNewFile()) {
							System.out.println("File created: " + file.getName());
						} else {
							System.out.println("File already exists.");
						}
					} catch (IOException e) {
						System.out.println("Exception occurred: " + e.getMessage());
						e.printStackTrace();
					}
				}
				// Writing into File
				case 2 -> {
					System.out.println("Enter file name (Existing file will be overwritten):");
					String writeFile = sc.nextLine(); // Use nextLine to read the file name
					File file = new File(writeFile);

					if (file.exists()) {
						System.out.println("File Accessed: " + file.getName());
					} else {
						System.out.println("File doesn't exist.");
						break;
					}

					try (FileWriter fileWriter = new FileWriter(file)) {
						System.out.println("Enter content to write: ");
						String content = sc.nextLine(); // Use nextLine to read the entire content
						fileWriter.write(content + "\n");
						System.out.println("Content stored in file " + file.getName());
					} catch (Exception e) {
						System.out.println("Exception occurred: " + e.getMessage());
						e.printStackTrace();
					}
				}
				// Appending to File
				case 3 -> {
					System.out.println("Enter file name (Content will be appended):");
					String appendFile = sc.nextLine(); // Use nextLine to read the file name
					File file = new File(appendFile);

					if (file.exists()) {
						System.out.println("File Accessed: " + file.getName());
					} else {
						System.out.println("File doesn't exist.");
						break;
					}

					try (FileWriter fileAppender = new FileWriter(file, true)) {
						System.out.println("Enter content to append: ");
						String content = sc.nextLine(); // Use nextLine to read the entire content
						fileAppender.write(content + "\n");
						System.out.println("Content appended to file " + file.getName());
					} catch (Exception e) {
						System.out.println("Exception occurred: " + e.getMessage());
						e.printStackTrace();
					}
				}
				// Reading from File
				case 4 -> {
					System.out.println("Enter file name:");
					String readFile = sc.nextLine(); // Use nextLine to read the file name
					File file = new File(readFile);

					if (file.exists()) {
						System.out.println("File Accessed: " + file.getName());
					} else {
						System.out.println("File doesn't exist.");
						break;
					}

					try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
						String content;
						while ((content = fileReader.readLine()) != null) {
							System.out.println(content);
						}
					} catch (Exception e) {
						System.out.println("Exception occurred: " + e.getMessage());
						e.printStackTrace();
					}
				}
				// Exit
				case 5 -> {
					System.out.println("Exiting...");
					return; // Exit the loop and terminate the program
				}
				// Default case
				default -> System.out.println("Invalid Action!!!");
				}
			}
		}
	}
}
