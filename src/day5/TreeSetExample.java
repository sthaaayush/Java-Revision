package day5;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of Integer type
        TreeSet<Integer> num = new TreeSet<>();

        // Adding elements to the TreeSet
        num.add(15);
        num.add(30);
        num.add(25);
        num.add(5);
        num.add(40);

        // Displaying elements in natural order
        System.out.println("TreeSet elements:");
        for (Integer a : num) {
            System.out.println(a);
        }

        // Displaying the smallest element
        System.out.println("Smallest element: " + num.first());

        // Displaying the largest element
        System.out.println("Largest element: " + num.last());
    }
}
