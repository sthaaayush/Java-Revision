package Day1;

import java.util.Scanner;

public class ProjectC {
	public static void main(String[] args) {
		System.out.println("========================================================");
        System.out.println("Student Grade Management System");
        System.out.println("========================================================");
        try(Scanner sc=new Scanner(System.in)){
        	System.out.println("Enter number of Students");
        	int studentNumber= sc.nextInt();
        	
        	  if (studentNumber <= 0) {
                  System.out.println("Number of students must be greater than zero.");
                  return;
              }
        	  
        	int[] students=new int[studentNumber];
        	
        	System.out.println("Enter Student Grades");
        	for(int i=0;i<studentNumber;i++) {
        		System.out.print("Grade of Student"+i+": ");
        		students[i]=sc.nextInt();
        	}
        	int maxGrade=students[0];
        	int minGrade=students[0];
        	int totalGrade=0;
        	
        	for(int j:students) {
        		if(maxGrade<j) {
        			maxGrade=j;
        		}
        		if(minGrade>j) {
        			minGrade=j;
        		}
        		totalGrade+=j;
        	}
        	float avgGrade = totalGrade / studentNumber;
        	
        	System.out.println("Higest Grade: "+ maxGrade);
        	System.out.println("Lowest Grade: "+ minGrade);
        	System.out.printf("Average Grade: %.2f%n", avgGrade);
        }
	}
}
