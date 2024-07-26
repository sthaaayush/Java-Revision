package day4;

import java.io.File;
import java.io.IOException;

public class BasicFileSystem {
	public static void main(String[] args) {
		File file = new File("example.txt");

		// Create a new file
		try {
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred while creating the file.");
			e.printStackTrace();
		}

		// Check file properties
		if (file.exists()) {
			System.out.println("File exists.");
			System.out.println("Is file: " + file.isFile());
			System.out.println("Is directory: " + file.isDirectory());
			System.out.println("Can read: " + file.canRead());
			System.out.println("Can write: " + file.canWrite());
			System.out.println("Can execute: " + file.canExecute());
			System.out.println("File name: " + file.getName());
			System.out.println("File path: " + file.getPath());
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("File size (bytes): " + file.length());
			System.out.println("Last modified: " + file.lastModified());
		} else {
			System.out.println("File does not exist.");
		}

		// Delete the file
		if (file.delete()) {
			System.out.println("File deleted successfully.");
		} else {
			System.out.println("Failed to delete the file.");
		}
	}
}
