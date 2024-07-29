package day5;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<String> name = new Stack<>();
		
		name.push("Hari");
		name.push("Ram");
		name.push("Shyam");
		name.push("Someone");
		
		System.out.println("Original Stack");
		printStack(name);
		
		System.out.println("\nPoped: "+name.pop());
		printStack(name);
		
		System.out.println("\nPeeked: "+name.peek());
		printStack(name);
	}
	
	private static void printStack(Stack<String> elm) {
		for(String str: elm) {
			System.out.println(str);
		}
	}
}
