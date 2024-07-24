package Day2;

interface Veichle{
	void start();
	void stop();
}

class Bike implements Veichle{
	@Override
	public void start() {
		System.out.println("Bike Started");
	}
	
	@Override
	public void stop() {
		System.out.println("Bike Stopped");
	}
}

abstract class Appliance{
	public abstract void turnOn() ;
	public void plugIn() {
		System.out.println("Power supply started");
	}
}

class WashingMachine extends Appliance{
	@Override
	public void turnOn() {
		System.out.println("Rotating");
	}
}

class Refrigerator extends Appliance{
	@Override
	public void turnOn() {
		System.out.println("Cooling");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		WashingMachine w1=new WashingMachine();
		Refrigerator r1 = new  Refrigerator();
        Bike b1 = new Bike();

		w1.plugIn();
		w1.turnOn();
		
		r1.plugIn();
		r1.turnOn();
		
		b1.start();
		b1.stop();
	}
}
