package days2;

class Student {
    private String name;
    private int age;
    private float grade;

    // Constructor
    public Student(String name, int age, float grade) {
        this.name = name;
        setAge(age); // Using setter to include validation
        setGrade(grade); // Using setter to include validation
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Setter for grade with validation
    public void setGrade(float grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade");
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for grade
    public float getGrade() {
        return grade;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating an instance using the constructor
        Student s1 = new Student("Ram", 20, 67.54f);

        // Displaying student details
        System.out.print("Name: " + s1.getName() + "\nAge: " + s1.getAge() + "\nGrade: " + s1.getGrade());
    }
}
