package day2;

class Person{
	String name;
	char gender;
	long number;
	String address; 
	
	public Person(String name, char gender) {
		this.name=name;
		this.gender=gender;
	}
	
	public void setNumber(long number) {
		this.number=number;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public long getNumber() {
		return number;
	}
	
	public char getGender() {
		return gender;
	}
}

public class ClassAndObject {
	public static void main(String[] args) {
		Person p1=new Person("Hari",'M');
		p1.setAddress("Kathmandu");
		p1.setNumber(984334343);
		System.out.println("Name: "+p1.getName());
		System.out.println("Gender: "+p1.getGender());
		System.out.println("Address: "+p1.getAddress());
		System.out.println("Number: "+p1.getNumber());
	}
}
