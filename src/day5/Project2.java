package day5;

import java.util.*;

class Student {
	private int stdID;
	private String stdName;
	private List<Course> enrolledCourse;

	public Student(int stdID, String stdName) {
		this.stdID = stdID;
		this.stdName = stdName;
		this.enrolledCourse = new ArrayList<>();
	}

	public int getStdID() {
		return stdID;
	}

	public void setStdID(int stdID) {
		this.stdID = stdID;
	}

	public String getName() {
		return stdName;
	}

	public void setName(String stdName) {
		this.stdName = stdName;
	}

	public List<Course> getEnrolledCourse() {
		return enrolledCourse;
	}

	public void setEnrolledCourse(List<Course> enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}

	public void enrollInCourse(Course course) {
		if (!enrolledCourse.contains(course)) {
			enrolledCourse.add(course);
			if (!course.getEnrolledStudents().contains(this)) {
				course.addStudent(this);
			}
		}
	}

	@Override
	public String toString() {
		return "Student{stdID=" + getStdID() + ", name=" + getName() + ", enrolledCourse=" + getCourseIds() + "}";
	}

	private String getCourseIds() {
		List<Integer> courseIds = new ArrayList<>();
		for (Course course : enrolledCourse) {
			courseIds.add(course.getCourseId());
		}
		return courseIds.toString();
	}
}

class Course {
	private int courseId;
	private String courseName;
	private List<Student> enrolledStudents;

	public Course(int courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.enrolledStudents = new ArrayList<>();
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Student> getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(List<Student> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

	public void addStudent(Student student) {
		if (!enrolledStudents.contains(student)) {
			enrolledStudents.add(student);
			if (!student.getEnrolledCourse().contains(this)) {
				student.enrollInCourse(this);
			}
		}
	}

	@Override
	public String toString() {
		return "Course{courseId=" + getCourseId() + ", courseName=" + getCourseName() + ", enrolledStudents="
				+ getStudentIds() + "}";
	}

	private String getStudentIds() {
		List<Integer> studentIds = new ArrayList<>();
		for (Student student : enrolledStudents) {
			studentIds.add(student.getStdID());
		}
		return studentIds.toString();
	}
}

class CourseManagement {
	private List<Student> students;
	private List<Course> courses;

	public CourseManagement() {
		students = new ArrayList<>();
		courses = new ArrayList<>();
	}

	// Student Management
	public void addStudent(Student std) {
		if (!students.contains(std) && students.add(std)) {
			System.out.println("Success\n");
		} else {
			System.out.println("Failed\n");
		}
	}

	public void removeStudent(int stdID) {
		if (students.removeIf(students -> students.getStdID() == stdID)) {
			System.out.println("Success\n");
		} else {
			System.out.println("Failed\n");
		}
	}

	public void updateStudent(Student std) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStdID() == std.getStdID()) {
				students.set(i, std);
				System.out.println("Success\n");
				return;
			}
		}
		System.out.println("Failed\n");
	}

	public void searchStudentByID(int stdId) {
		for (Student s : students) {
			if (s.getStdID() == stdId) {
				System.out.println(s + "\n");
				return;
			}
		}
		System.out.println("No Result Found\n");
	}
	
	public void searchStudentByName(String stdName) {
		for (Student s : students) {
			if (s.getName().equalsIgnoreCase(stdName)) {
				System.out.println(s + "\n");
				return;
			}
		}
		System.out.println("No Result Found\n");
	}

	// Displaying List
	public void displayStudents() {
		for (Student dis : students) {
			System.out.println(dis);
		}
		System.out.println();
	}

	public void displayCourses() {
		for (Course dis : courses) {
			System.out.println(dis);
		}
		System.out.println();
	}
}

public class Project2 {
	public static void main(String[] args) {
		CourseManagement cm = new CourseManagement();

		Student student1 = new Student(1, "John Doe");
		Student student2 = new Student(2, "Jane Smith");
		Student student3 = new Student(1, "Moe Doe");
		Course course1 = new Course(101, "Math");
		Course course2 = new Course(102, "Science");

		cm.addStudent(student1);
		cm.addStudent(student2);
		cm.displayStudents();

		cm.removeStudent(student2.getStdID());
		cm.displayStudents();

		cm.addStudent(student2);
		cm.updateStudent(student3);
		cm.displayStudents();

		cm.searchStudentByID(2);
		cm.searchStudentByName("Moe Doe");
	}
}
