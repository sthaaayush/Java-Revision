package day1;

class Car{
	int sn;
	String name;
	double price;
}

public class RefeDatatypes {
	public static void main(String [] args) {
		Car m1 = new Car();
		m1.sn=230;
		m1.name="BMW";
		m1.price=100000.34;
		
		System.out.println("Car description"
				+ "\nSN: "+m1.sn+"\n"+m1.name+"\nNrs. "+ m1.price);
	}
}
