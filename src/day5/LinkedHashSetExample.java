package day5;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of Character type
        LinkedHashSet<Character> chars = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        chars.add('A');
        chars.add('C');
        chars.add('B');
        chars.add('E');
        chars.add('D');

        // Displaying the elements in the LinkedHashSet
        System.out.println("LinkedHashSet elements:");
        for (Character a : chars) {
            System.out.println(a);
        }
    }
}
