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

public class Project2 {
	public static void main(String[] args) {
		Student student1 = new Student(1, "John Doe");
		Student student2 = new Student(2, "Jane Smith");

		Course course1 = new Course(101, "Math");
		Course course2 = new Course(102, "Science");

		student1.enrollInCourse(course1);
		student1.enrollInCourse(course2);

		student2.enrollInCourse(course1);

		System.out.println(student1);
		System.out.println(student2);

		System.out.println(course1);
		System.out.println(course2);
	}
}
