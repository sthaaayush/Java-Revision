package Day2;

class Animals{
	String animalClass, name;
	public Animals(String animalClass, String name) {
		this.animalClass=animalClass;
		this.name=name;
	}
	
	public void sound() {
		System.out.println("Nothing");
	}
	
	public void product() {
		System.out.println("Nothing");
	}
}

class Cow extends Animals{
	public Cow() {
		super("mammals", "cow");
	}
	
	@Override
	public void sound() {
		System.out.println("Moo");
	}
	
	@Override
	public void product() {
		System.out.println("Milk");
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
		Cow c1=new Cow();
		
		System.out.println("Name:"+c1.name+"\nClass:"+c1.animalClass);
		c1.sound();
		c1.product();
	}
}
