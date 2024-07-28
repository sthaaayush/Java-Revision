package days2;

import java.util.Scanner;

class Contact {
	private String name;
	private String phoneNumber;
	private String email;

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber.length() == 10) {
			this.phoneNumber = phoneNumber;
		} else {
			System.out.println("Phone number should be exactly 10 digits:");
		}
	}

	public void setEmail(String email) {
		if (email.matches(".*@gmail.com$")) {
			this.email = email;
		} else {
			System.out.println("Invalid email format");
		}
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}
}

public class ProjectA {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("***Welcome To Contact Management System***");

			System.out.println("Enter number of contacts to record:");
			int count = sc.nextInt();
			Contact[] contacts = new Contact[count];

			for (int i = 0; i < contacts.length; i++) {
				contacts[i] = new Contact();
				System.out.println("Entering Details of Contact-" + (i + 1) + ":");

				System.out.println("Name:");
				String name = sc.next();
				contacts[i].setName(name);

				System.out.println("Phone Number (Must be 10 digits):");
				String phoneNumber = sc.next();
				contacts[i].setPhoneNumber(phoneNumber);

				System.out.println("Email (xyz@gmail.com):");
				String email = sc.next();
				contacts[i].setEmail(email);
			}

			for (Contact contact : contacts) {
				System.out.println("\n===========================================");
				System.out.println("Name: " + contact.getName());
				System.out.println("Phone No.: " + contact.getPhoneNumber());
				System.out.println("Email: " + contact.getEmail());
				System.out.println("===========================================");
			}
		}
	}
}
