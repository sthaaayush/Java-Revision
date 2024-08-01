package day5;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap with default initial capacity and load factor
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Adding elements to the LinkedHashMap
        linkedHashMap.put(1, "One");
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(5, "Five");
        linkedHashMap.put(4, "Four");

        // Displaying elements in insertion order
        System.out.println("LinkedHashMap elements in insertion order:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Accessing elements to demonstrate access order
        linkedHashMap.get(3);
        linkedHashMap.get(1);

        // Displaying elements in access order (order of access)
        System.out.println("\nLinkedHashMap elements in access order:");
        LinkedHashMap<Integer, String> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.putAll(linkedHashMap);
        for (Map.Entry<Integer, String> entry : accessOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
