package day5;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of Integer type
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);

        // Displaying the original queue
        System.out.println("Original Queue:");
        printQueue(numbers);

        // Displaying the head of the queue without removal
        System.out.println("\nElement in head (Without removal): " + numbers.peek());
        printQueue(numbers);

        // Displaying the head of the queue with removal
        System.out.println("\nElement in head (With removal): " + numbers.poll());
        printQueue(numbers);
    }

    // Method to print elements of the PriorityQueue
    private static void printQueue(PriorityQueue<Integer> num) {
        for (Integer a : num) {
            System.out.println(a);
        }
    }
}
