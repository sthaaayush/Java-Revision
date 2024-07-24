package day1;

public class ControlStam {
	public static void main(String[] args) {
		int day = 2;
		switch (day) {
		case 1 -> System.out.print("Sunday");
		case 2 -> System.out.print("Monday");
		case 3 -> System.out.print("Tueday");
		case 4 -> System.out.print("Wednesday");
		case 5 -> System.out.print("Thrusday");
		case 6 -> System.out.print("Friday");
		case 7 -> System.out.print("Saturday");
		default -> System.out.print("Invaild day");
		}
		 System.out.println("\n"); // '\n' is and escape sequence works like enter in keyboard
		int a=43;
		if(a%2==0) {// '%' modulus is an operator that result the remainder of two number dividend % divider = remainder
			 System.out.print(a + " is even numeber");
		}else {
			 System.out.print(a + " is odd number");
		}
	}
}
