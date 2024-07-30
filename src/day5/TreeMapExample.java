package day5;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap of roll numbers and their corresponding values
        TreeMap<Integer, Integer> rollNumber = new TreeMap<>();

        // Adding entries to the TreeMap
        rollNumber.put(3, 234);
        rollNumber.put(4, 236);
        rollNumber.put(2, 244);
        rollNumber.put(1, 216);
        rollNumber.put(5, 231);
        rollNumber.put(6, 206);

        // Printing the original TreeMap
        System.out.println("Original Map:");
        printMap(rollNumber);

        // Removing an entry with key 1
        System.out.println("\nAfter removing the value mapped at key 1:");
        if (rollNumber.containsKey(1)) {
            rollNumber.remove(1);
        }
        printMap(rollNumber);

        // Printing the first and last keys
        System.out.println("\nFirst Key = " + rollNumber.firstKey());
        System.out.println("Last Key = " + rollNumber.lastKey());

        // Printing the headMap and tailMap
        System.out.println("\nHeadMap for key 4: " + rollNumber.headMap(4));
        System.out.println("TailMap for key 4: " + rollNumber.tailMap(4));

        // Printing the size of the TreeMap
        System.out.println("Size of map: " + rollNumber.size());
    }

    // Method to print the entries of the TreeMap
    private static void printMap(TreeMap<Integer, Integer> tree) {
        for (Map.Entry<Integer, Integer> val : tree.entrySet()) {
            System.out.println(val.getKey() + " => " + val.getValue());
        }
    }
}
