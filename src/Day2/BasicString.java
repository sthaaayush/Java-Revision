package day2;

public class BasicString {
	public static void main(String[] main) {
        // Initialize a string variable
        String str = "Hello, World!";

        // Print the original string
        System.out.println("Original String: [" + str + "]");

        // Print the length of the string
        System.out.println("Length: " + str.length());

        // Print the character at index 7 (0-based index)
        System.out.println("Character at index 7: " + str.charAt(7));

        // Print the substring from index 3 to index 8 (exclusive)
        System.out.println("Substring from index 3 to 8: " + str.substring(3, 8));

        // Convert the string to uppercase and print it
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert the string to lowercase and print it
        System.out.println("Lowercase: " + str.toLowerCase());

        // Trim whitespace from both ends and print the trimmed string
        System.out.println("Trimmed: [" + str.trim() + "]");

        // Replace all occurrences of 'o' with '0' and print the result
        System.out.println("Replaced 'o' with '0': " + str.replace('o', '0'));

        // Concatenate '!!' to the end of the string and print the result
        System.out.println("Concatenated with '!!': " + str.concat("!!"));

        // Find and print the index of the first occurrence of 'World'
        System.out.println("Index of 'World': " + str.indexOf("World"));

        // Find and print the index of the last occurrence of 'o'
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        // Split the string by ',' and print the resulting array joined by ', '
        System.out.println("Split by ',': " + String.join(", ", str.split(",")));

        // Check if the string starts with 'Hello' and print the result
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

        // Check if the string ends with 'World! ' and print the result
        System.out.println("Ends with 'World! ': " + str.endsWith("World!"));

        // Check if the string contains 'World' and print the result
        System.out.println("Contains 'World': " + str.contains("World"));

        // Check if the string matches the regex pattern '.*World.*' and print the result
        System.out.println("Matches '.*World.*': " + str.matches(".*World.*"));
    }
}
