package day5;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> name = new Stack<>();

        name.push("Hari");
        name.push("Ram");
        name.push("Shyam");
        name.push("Someone");

        System.out.println("Original Stack:");
        printStack(name);

        if (!name.isEmpty()) {
            System.out.println("\nPopped: " + name.pop());
            printStack(name);
        }

        if (!name.isEmpty()) {
            System.out.println("\nPeeked: " + name.peek());
            printStack(name);
        }

        System.out.println("\nStack size: " + name.size());
    }

    private static void printStack(Stack<String> stack) {
        for (String str : stack) {
            System.out.println(str);
        }
    }
}
