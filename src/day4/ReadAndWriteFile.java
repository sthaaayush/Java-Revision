package day4;

import java.io.*;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        File file = new File("RWFile.txt");

        try {
            if (file.createNewFile()) {
                System.out.println(file.getName() + " created successfully");
            } else {
                System.out.println(file.getName() + " already exists");
            }
        } catch (IOException e) {
            System.out.println("Exception occurred while creating file: " + e.getMessage());
        }

        try (FileWriter fileWrite = new FileWriter(file, true)) {
            String data = "Hello World!!!";
            fileWrite.write(data);
            fileWrite.append("\nNew world hii!!");

            System.out.println("Data written successfully");
        } catch (IOException e) {
            System.out.println("Exception occurred while writing to file: " + e.getMessage());
        }
    }
}

