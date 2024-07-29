package day5;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> animal = new HashMap<>();

        animal.put(1, "Cow");
        animal.put(2, "Dog");
        animal.put(3, "Hen");
        animal.put(4, "Tiger");
        animal.put(5, "Rhino");

        System.out.println("Original Map:");
        printMap(animal);

        // Display key set, value collection, and entry set
        System.out.println("\nSet of keys: " + animal.keySet());
        System.out.println("Set of key-value pairs: " + animal.entrySet());
        System.out.println("Set of values: " + animal.values());

        // Removing an entry
        System.out.println("\nRemoving entry with key 3:");
        animal.remove(3);
        printMap(animal);

        // Checking if a key exists
        System.out.println("\nDoes key 4 exist? " + animal.containsKey(4));

        // Checking if a value exists
        System.out.println("Is 'Dog' present? " + animal.containsValue("Dog"));

        // Getting the size of the map
        System.out.println("\nSize of HashMap: " + animal.size());
    }

    public static void printMap(HashMap<Integer, String> objMap) {
        for (Map.Entry<Integer, String> maps : objMap.entrySet()) {
            System.out.println(maps.getKey() + " => " + maps.getValue());
        }
    }
}
