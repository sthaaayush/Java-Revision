package day4;

import java.io.*;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class FilePrintWriter {
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Student details");

            System.out.println("ID:");
            s1.setId(sc.nextInt());
            sc.nextLine(); 
            
            System.out.println("Name:");
            s1.setName(sc.nextLine());

            System.out.println("Address:");
            s1.setAddress(sc.nextLine());

            System.out.println("Phone Number:");
            s1.setPhoneNumber(sc.nextLine());

            File file = new File("StudentInfo.txt");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
                pw.printf("ID: %05d Name: %-20s Address: %-30s Phone Number: %-15s%n",
                          s1.getId(), s1.getName(), s1.getAddress(), s1.getPhoneNumber());
                pw.flush();
                System.out.println("Data stored successfully");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close(); 
        }
    }
}
