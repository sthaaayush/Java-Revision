package day5;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<String> place=new Vector<>();
		
		place.add("Kathmandu");
		place.add("Pokhara");
		place.add("Dharan");
		place.add("Bhaktapur");
		
		System.out.println("Original list");
		printList(place); 
		
		System.out.println("\nRemoving elements at [2]");
		place.remove(2);
		printList(place);
	}
	
	private static void printList(Vector<String> list) {
		for(String a: list) {
			System.out.println(a);                    
		}
	}
}
