package day4;

import java.io.*;

public class BufferReadWriter {
    public static void main(String[] args) {
        File file = new File("BUfferRWFile.txt");

        // Writes Files using BufferedWriter
        try {
            if (file.createNewFile()) {
                System.out.println(file.getName() + " created successfully");
            } else {
                System.out.println(file.getName() + " already exists");
            }
        } catch (IOException e) {
            System.out.println("Exception occurred while creating file: " + e.getMessage());
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            String data = "Hello World!!!";
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.write("New world hii!!");

            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("Exception occurred while writing to file: " + e.getMessage());
        }

        // Reads Files using BufferedReader
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
