package day3;

class NullValueException extends Exception{
	public NullValueException(String msg) {
		super(msg);
	}
}

public class CustomeException {
	public static void arrDisplay(String name) throws NullValueException{
		if (name==null || name.isEmpty()) {
			throw new NullValueException("Name cannot be empty");
		}else {
			System.out.println("Hello, "+name);
		}
	}
	
	public static void main(String[] args) {
		try {
			arrDisplay("");
		} catch (NullValueException e) {
			System.out.println("Exception caught:"+ e.getMessage());
		} finally {
			System.out.println("Finally block executed");
		}
	}
}
