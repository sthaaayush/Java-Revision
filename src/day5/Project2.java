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

	// Course Management
	public void addCourse(Course course) {
		if (!courses.contains(course) && courses.add(course)) {
			System.out.println("Success\n");
		} else {
			System.out.println("Failed\n");
		}
	}

	public void removeCourse(int courseId) {
		if (courses.removeIf(course -> course.getCourseId() == courseId)) {
			System.out.println("Success\n");
		} else {
			System.out.println("Failed\n");
		}
	}

	public void updateCourse(Course course) {
		for (int i = 0; i < courses.size(); i++) {
			if (courses.get(i).getCourseId() == course.getCourseId()) {
				courses.set(i, course);
				System.out.println("Success\n");
				return;
			}
		}
		System.out.println("Failed\n");
	}

	public void searchCourseByID(int courseId) {
		for (Course c : courses) {
			if (c.getCourseId() == courseId) {
				System.out.println(c + "\n");
				return;
			}
		}
		System.out.println("No Result Found\n");
	}

	public void searchCourseByName(String courseName) {
		for (Course c : courses) {
			if (c.getCourseName().equalsIgnoreCase(courseName)) {
				System.out.println(c + "\n");
				return;
			}
		}
		System.out.println("No Result Found\n");
	}

	// Enroll a student in a course
	public void enrollStudentInCourse(int studentID, int courseID) {
		Student student = null;
		Course course = null;

		for (Student s : students) {
			if (s.getStdID() == studentID) {
				student = s;
				break;
			}
		}

		for (Course c : courses) {
			if (c.getCourseId() == courseID) {
				course = c;
				break;
			}
		}

		if (student != null && course != null) {
			if (!student.getEnrolledCourse().contains(course)) {
				student.getEnrolledCourse().add(course);
				course.getEnrolledStudents().add(student);
				System.out.println("Enrollment Success\n");
			} else {
				System.out.println("Student already enrolled in this course\n");
			}
		} else {
			System.out.println("Student or Course not found\n");
		}
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
		Course course1 = new Course(101, "Math");
		Course course2 = new Course(102, "Science");

		// Student Feature implication
		cm.addStudent(student1);
		cm.addStudent(student2);
		cm.displayStudents();

		cm.removeStudent(student2.getStdID());
		cm.displayStudents();

		cm.addStudent(student2);
		cm.updateStudent(new Student(1, "Moe Doe"));
		cm.displayStudents();

		cm.searchStudentByID(2);
		cm.searchStudentByName("Moe Doe");

		// Course Feature implication
		cm.addCourse(course1);
		cm.addCourse(course2);
		cm.displayCourses();

		cm.removeCourse(course2.getCourseId());
		cm.displayCourses();

		cm.addCourse(course2);
		cm.updateCourse(new Course(102, "Advanced Science"));
		cm.displayCourses();

		cm.searchCourseByID(101);
		cm.searchCourseByName("Advanced Science");

		// Enrollment implication
		cm.enrollStudentInCourse(1, 101);
		cm.enrollStudentInCourse(1, 102);
		cm.displayStudents();
		cm.displayCourses();
	}
}
