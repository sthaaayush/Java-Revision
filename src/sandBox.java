
import java.util.HashSet;
import java.util.Iterator;

public class sandBox {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> animals = new HashSet<>();

        // Adding elements to the HashSet
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Cow");
        animals.add("Dog");  // Duplicate element

        // Displaying the HashSet
        System.out.println("Original HashSet:");
        printSet(animals);

        // Removing an element
        animals.remove("Cat");
        System.out.println("\nAfter removing 'Cat':");
        printSet(animals);

        // Checking if an element exists
        System.out.println("\nHashSet contains 'Horse': " + animals.contains("Horse"));

        // Checking the size of the HashSet
        System.out.println("Size of HashSet: " + animals.size());

        // Iterating over the elements
        System.out.println("\nIterating over HashSet:");
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Clearing the HashSet
        animals.clear();
        System.out.println("\nHashSet after clearing:");
        System.out.println(animals);
    }

    // Method to print elements of the HashSet
    private static void printSet(HashSet<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }
}
