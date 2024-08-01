package day5;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> numbers=new PriorityQueue<Integer>();
		numbers.add(30);
		numbers.add(10);
		numbers.add(50);
		numbers.add(20);
		numbers.add(40);
		
		System.out.println("Original Queue:");
		printQueue(numbers);
		
		System.out.println("\nElement in head(Without removal): "+numbers.peek());
		printQueue(numbers);
		
		System.out.println("\nElement in head(With removal): "+numbers.poll());
		printQueue(numbers);
	}
	
	private static void printQueue(PriorityQueue<Integer> num) {
		for(Integer a: num) {
			System.out.println(a);
		}
	}
}
