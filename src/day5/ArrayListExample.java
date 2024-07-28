package day5;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();

        fruitsList.add("Apple");
        fruitsList.add("Jackfruit");
        fruitsList.add("Pineapple");
        fruitsList.add("Kiwi");
        fruitsList.add("Banana");
        
        System.out.println("Original Fruit list:");
        printList(fruitsList);

        fruitsList.add(2, "Grapes");
 
        System.out.println("\nAdding new fruit at [2]:");
        printList(fruitsList);

        System.out.println("\nBefore replacing at [0]: " + fruitsList.get(0));
        fruitsList.set(0, "Blueberry");
        System.out.println("After replacing at [0]: " + fruitsList.get(0));
        System.out.println("Updated List:");
        printList(fruitsList);

        System.out.println("\nBefore removing at [3]: " + fruitsList.get(3));
        fruitsList.remove(3);
        System.out.println("After removing at [3]: " + fruitsList.get(3));
        System.out.println("Updated List:");
        printList(fruitsList);

        System.out.println("\nClearing List:");
        fruitsList.clear();
        System.out.println("List after clearing: " + fruitsList);
    }

    private static void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " : " + list.get(i));
        }
    }
}
