package day4;

import java.io.*;

class Car implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private float price;

	public Car(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Car{" + "name='" + name + "'," + "price=" + price + "" + "}";
	}

}

public class SerializableExample {
	public static void main(String[] args) {
		Car c1 = new Car("BMW", 20000.45f);
		// Serializing Object
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.ser"))) {
			oos.writeObject(c1);
			System.out.println("Object serialized");
		} catch (Exception e) {
			System.out.println("Exception occur: " + e.getMessage());
		}

		// Deserializing
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.ser"))) {
			Car c2 = (Car) ois.readObject();
			System.out.println("Object deserialized: " + c2.toString());

		} catch (Exception e) {
			System.out.println("Exception occur: " + e.getMessage());
		}
	}
}
