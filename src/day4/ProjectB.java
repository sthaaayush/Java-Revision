package day4;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Students implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String address;
	private String phoneNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id <= 9999)
			this.id = id;
		else
			System.out.println("Invaild ID");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isEmpty() || name == null)
			System.out.println("Name cannot be empty");
		else
			this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address.isEmpty() || address == null)
			System.out.println("Address cannot be empty");
		else
			this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber.length() == 10)
			this.phoneNumber = phoneNumber;
		else
			System.out.println("Invaild Number Format");
	}

	@Override
	public String toString() {
		return "Students{" + "id= " + id + ", " + "name= " + name + ", " + "address= " + address + ", "
				+ "phoneNumber= " + phoneNumber + "}";
	}

}

public class ProjectB {
	public static void main(String[] args) {
		System.out.println("****Student Record Management System with Serialization****");
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println(
					"Enter Choice of Operation:" + "\n1.Record Student Information:\n2.Display Student Information");
			int userChoice = sc.nextInt();
			sc.nextLine(); // Consume newline left-over

			if (userChoice == 1) {
				Students s1 = new Students();
				System.out.println("Enter Details to proceed:");
				System.out.println("ID:");
				s1.setId(sc.nextInt());
				sc.nextLine();
				System.out.println("Name:");
				s1.setName(sc.nextLine());
				System.out.println("Address:");
				s1.setAddress(sc.nextLine());
				System.out.println("Phone Number:");
				s1.setPhoneNumber(sc.nextLine());

				try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(s1.getId() + ".ser"))) {
					oos.writeObject(s1);
					System.out.println(s1.getName() + " Data Recorded.");
				} catch (Exception e) {
					System.out.println("Exception caught:" + e.getMessage());
					e.printStackTrace();
				}
			} else if (userChoice == 2) {
				System.out.println("Enter Student ID to Display:");
				int id = sc.nextInt();
				try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(id + ".ser"))) {
					Students readObj = (Students) ois.readObject();
					System.out.println("Student details are: \n" + readObj.toString());
				} catch (Exception e) {
					System.out.println("Exception caught:" + e.getMessage());
					e.printStackTrace();
				}
			} else {
				System.out.println("Invalid Operation");
				return;
			}

		}
	}
}
