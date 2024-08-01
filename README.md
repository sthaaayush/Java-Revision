## Java-Revision
**[Day 1: Java Learning Journey](/src/Day1)**

**Overview:**
Today, I focused on foundational Java concepts, including understanding the Java Development Kit (JDK), Java Runtime Environment (JRE), and Java Virtual Machine (JVM). I also explored primitive data types, control flow statements, and loops.

**Topics Covered:**

1. **Java Basics:**
   - **JDK, JRE, and JVM**: Learned the differences and relationships between JDK, JRE, and JVM. 
   - **Primitive Data Types**: Covered different primitive data types, their sizes, ranges, and default values.

2. **Control Flow Statements:**
   - **`if-else` Statements**: Used to make decisions in the code.
   - **`switch` Statement**: Employed for multi-way branching.

3. **Loops:**
   - **`for` Loop**: Iterated over a range of values.
   - **`while` and `do-while` Loops**: Used for repeated execution of code blocks.

4. **Project Implementations:**
   - **[Guess the Number Game](src/Day1/ProjectA.java)**: A console application where the user guesses a random number.
   - **[Simple Calculator](src/Day1/ProjectC.java)**: A console application that performs basic arithmetic operations based on user input.
   - **[Student Grade Management System](src/Day1/ProjectC.java)**: A console application to input grades, calculate the highest, lowest, and average grades.

**Key Learnings:**
- **Primitive Data Types**: Their properties and usage.
- **Control Flow**: Making decisions and branching in code.
- **Loops**: Repeating tasks and iteration.
- **Project Practice**: Implementing projects to reinforce learning and understanding of the concepts.
---
**[Day 2: OOPS Concept](/src/Day2)**

**Overview:**
Today, I focused on advanced Java concepts including inheritance, polymorphism, encapsulation, abstraction, arrays, and strings. I also worked on practical projects to solidify my understanding of these concepts.

**Topics Covered:**

1. **Inheritance:**
   - **Concept**: Allows a class to inherit fields and methods from another class, promoting code reuse.
   - **Key Points**: Superclasses, subclasses, `super` keyword.

2. **Polymorphism:**
   - **Compile-time Polymorphism**: Method overloading.
   - **Runtime Polymorphism**: Method overriding.
   - **Key Points**: Same method names behaving differently based on the object.

3. **Encapsulation:**
   - **Concept**: Bundling of data with methods that operate on that data, restricting direct access.
   - **Key Points**: Private fields, public getter and setter methods.

4. **Abstraction:**
   - **Concept**: Hiding implementation details and showing only the functionality.
   - **Key Points**: Abstract classes, interfaces.

5. **Arrays:**
   - **Single-dimensional Arrays**: Storing and accessing data.
   - **Multi-dimensional Arrays**: Handling complex data structures.
   - **Key Points**: Declaration, initialization, and manipulation.

6. **Strings:**
   - **Concept**: Objects representing sequences of characters, with methods to perform operations.
   - **Key Points**: Methods like `length()`, `charAt()`, `substring()`, `toUpperCase()`, `toLowerCase()`, `trim()`, `replace()`, `concat()`, `indexOf()`, `lastIndexOf()`, `split()`, `startsWith()`, `endsWith()`, `contains()`, `matches()`.

**Project Implementations:**

1. **[Contact Management System](src/Day2/ProjectA.java)**:
   - **Description**: A system to manage contact details using encapsulation.
   - **Key Features**: Adding, displaying contact details with validation for phone numbers and email addresses.

2. **[String Manipulation Tool](src/Day2/ProjectB.java)**:
   - **Description**: A tool to perform various string operations.
   - **Key Features**: Converting to uppercase, lowercase, finding length, checking prefixes and suffixes, replacing characters, splitting strings.

**Key Learnings:**
- **Inheritance**: Reusing code and establishing relationships between classes.
- **Polymorphism**: Methods performing different tasks based on the object.
- **Encapsulation**: Protecting data and providing controlled access.
- **Abstraction**: Simplifying complex systems by hiding unnecessary details.
- **Arrays**: Managing collections of data efficiently.
- **Strings**: Utilizing powerful string manipulation methods.
- **Project Practice**: Implementing projects to reinforce learning and understanding of the concepts.
---
**[Day 3: Exception Handling and Custom Exceptions](src/Day3)**

**Overview:**
Today, I focused on understanding and implementing exception handling in Java, including creating custom exceptions and handling them in a sample project.

**Topics Covered:**

1. **Exception Handling Basics:**
   - **`try-catch` Block**: Used for handling exceptions.
   - **`finally` Block**: Executed regardless of whether an exception occurred.

2. **Creating Custom Exceptions:**
   - **Defining a Custom Exception**: Extended the `Exception` class to create a custom exception.
   - **Throwing and Catching Custom Exceptions**: Used custom exceptions in code and handled them appropriately.

3. **Project Implementations:**
   - **[Custom Exception Example](src/day3/CustomeException.java)**: Implemented a project demonstrating custom exceptions by creating a `NullValueException` for handling empty or null values.

**Key Learnings:**
- **Exception Handling**: Managed exceptions using `try-catch` and `finally` blocks.
- **Custom Exceptions**: Defined and used custom exceptions for specific error handling.
- **Project Practice**: Applied exception handling concepts in a practical example.

---

**[Day 4: File I/O and Serialization](src/Day4)**

**Overview:**
Today's focus was on file handling and serialization in Java. This included reading from and writing to files, and understanding how to serialize and deserialize objects.

**Topics Covered:**

1. **File I/O:**
   - **File Handling**: Created and managed files and directories using `File` class.
   - **File Writing**: Used `FileWriter`, `BufferedWriter`, and `PrintWriter` for writing to files.
   - **File Reading**: Used `FileReader` and `BufferedReader` for reading from files.

2. **Serialization:**
   - **Serializable Interface**: Implemented `Serializable` interface to enable object serialization.
   - **Object Serialization and Deserialization**: Used `ObjectOutputStream` and `ObjectInputStream` to write and read serialized objects.

3. **Project Implementations:**
   - **[File Management System](src/day4/ProjectA.java)**: A console application to manage files, including creating, writing, appending, and reading files.
   - **[Student Record Management System](src/day4/ProjectB.java)**: A console application to serialize and deserialize student records, allowing for storage and retrieval of student data.

**Key Learnings:**
- **File I/O**: Managed file operations and data manipulation using various file I/O classes.
- **Serialization**: Enabled object serialization for saving and retrieving object states.
- **Project Practice**: Implemented projects to reinforce file handling and serialization concepts.

---

**[Day 5: Java Collections](src/Day5)**

**Overview:**
Today's focus was on learning and practicing various Java Collections, specifically `ArrayList`, `LinkedList`, `Stack`, `Vector`, `HashMap`, `TreeMap`, and `HashSet`. This included understanding their characteristics, common methods, and practical implementations.

**Topics Covered:**

1. **ArrayList:**
   - **Introduction to ArrayList**: Understanding the dynamic array implementation in Java.
   - **Common Methods**: 
     - `add(E e)`
     - `remove(int index)`
     - `get(int index)`
     - `set(int index, E element)`
     - `size()`
     - `clear()`
   - **Example**: Creating, manipulating, and iterating through an ArrayList.

2. **Iterator:**
   - **Introduction to Iterator**: Traversing through collections using Iterator.
   - **Common Methods**:
     - `hasNext()`
     - `next()`
     - `remove()`
   - **Example**: Using Iterator to traverse through a collection.

3. **LinkedList:**
   - **Introduction to LinkedList**: Understanding the doubly-linked list implementation in Java.
   - **Common Methods**:
     - `add(E e)`
     - `remove(int index)`
     - `get(int index)`
     - `set(int index, E element)`
     - `size()`
     - `clear()`
   - **Example**: Creating and manipulating a LinkedList of custom objects.

4. **Stack:**
   - **Introduction to Stack**: Understanding the LIFO (Last In First Out) principle.
   - **Common Methods**:
     - `push(E item)`
     - `pop()`
     - `peek()`
     - `isEmpty()`
     - `size()`
   - **Example**: Using Stack to store and manipulate a collection of strings.

5. **Vector:**
   - **Introduction to Vector**: Understanding the dynamic array with synchronized methods.
   - **Common Methods**:
     - `add(E e)`
     - `remove(int index)`
     - `get(int index)`
     - `set(int index, E element)`
     - `size()`
     - `clear()`
   - **Example**: Creating and manipulating a Vector of strings.

6. **HashMap:**
   - **Introduction to HashMap**: Understanding the key-value pair mapping.
   - **Common Methods**:
     - `put(K key, V value)`
     - `remove(Object key)`
     - `get(Object key)`
     - `containsKey(Object key)`
     - `containsValue(Object value)`
     - `keySet()`
     - `values()`
     - `entrySet()`
     - `size()`
     - `clear()`
   - **Example**: Creating, manipulating, and iterating through a HashMap.

7. **TreeMap:**
   - **Introduction to TreeMap**: Understanding the sorted key-value pair mapping.
   - **Common Methods**:
     - `put(K key, V value)`
     - `remove(Object key)`
     - `get(Object key)`
     - `containsKey(Object key)`
     - `firstKey()`
     - `lastKey()`
     - `headMap(K toKey)`
     - `tailMap(K fromKey)`
     - `size()`
     - `clear()`
   - **Example**: Creating, manipulating, and iterating through a TreeMap.

8. **HashSet:**
   - **Introduction to HashSet**: Understanding the unique element collection.
   - **Common Methods**:
     - `add(E e)`
     - `remove(Object o)`
     - `contains(Object o)`
     - `isEmpty()`
     - `size()`
     - `clear()`
   - **Example**: Creating, manipulating, and iterating through a HashSet.

9. **PriorityQueue:**
   - **Introduction to PriorityQueue**: Understanding the queue that orders its elements based on their natural ordering or by a specified comparator.
   - **Common Methods**:
     - `add(E e)`
     - `offer(E e)`
     - `peek()`
     - `poll()`
     - `remove(Object o)`
     - `size()`
   - **Example**: Creating and using a PriorityQueue to store and retrieve elements in priority order.

10. **LinkedHashSet:**
    - **Introduction to LinkedHashSet**: Understanding a HashSet with predictable iteration order based on insertion.
    - **Common Methods**:
      - `add(E e)`
      - `remove(Object o)`
      - `contains(Object o)`
      - `isEmpty()`
      - `size()`
      - `clear()`
    - **Example**: Creating and manipulating a LinkedHashSet of strings.

11. **TreeSet:**
    - **Introduction to TreeSet**: Understanding a NavigableSet that uses a Red-Black tree to store elements in a sorted order.
    - **Common Methods**:
      - `add(E e)`
      - `remove(Object o)`
      - `contains(Object o)`
      - `first()`
      - `last()`
      - `headSet(E toElement)`
      - `tailSet(E fromElement)`
      - `size()`
      - `clear()`
    - **Example**: Creating and manipulating a TreeSet of integers.

12. **ProjectA (Library Management System):**
    - **Detailed Implementation**:
      - **Book Class**: Represents a book with attributes such as title, author, ISBN, and availability. Includes methods for setting and getting these attributes.
      - **Member Class**: Represents a library member with attributes such as name, ID, and a list of borrowed books. Includes methods for setting and getting these attributes.
      - **Library Class**: Manages the collection of books and members. Provides methods to add, remove, search for books and members, and handle borrowing and returning of books. 
      - **Borrowing Books**: Added functionality to borrow books, ensuring the book is available and updating the member's borrowed books list.
      - **Returning Books**: Added functionality to return books, ensuring the book is borrowed by the member and updating the member's borrowed books list and the book's availability.