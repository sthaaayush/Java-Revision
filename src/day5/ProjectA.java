package day5;

import java.util.*;

class Book {
    private String title;
    private String author;
    private long ISBN;
    private boolean available;

    public Book(String a, String b, long c, boolean d) {
        this.title = a;
        this.author = b;
        this.ISBN = c;
        this.available = d;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long iSBN) {
        ISBN = iSBN;
    }

    @Override
    public String toString() {
        return "Book [Title=" + title + ", Author=" + author + ", ISBN=" + ISBN + ", Available=" + available + "]";
    }
}

class Member {
    private String name;
    private int ID;
    private List<Book> borrowedBooks;

    public Member(String name, int ID, List<Book> borrowedBooks) {
        this.name = name;
        this.ID = ID;
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "Member [Name=" + name + ", ID=" + ID + ", BorrowedBooks=" + borrowedBooks + "]";
    }
}

class Library {
    private ArrayList<Book> book;
    private Set<Member> member;

    public Library() {
        book = new ArrayList<Book>();
        member = new HashSet<Member>();
    }

    public void addBook(Book b1) {
        if (book.add(b1)) {
            System.out.println("Book added successfully: " + b1);
        } else {
            System.out.println("Failed to add book.");
        }
    }

    public void addMember(Member m1) {
        if (member.add(m1)) {
            System.out.println("Member added successfully: " + m1);
        } else {
            System.out.println("Failed to add member.");
        }
    }

    public void removeBook(Book b1) {
        if (book.remove(b1)) {
            System.out.println("Book removed successfully: " + b1);
        } else {
            System.out.println("Failed to remove book.");
        }
    }

    public void removeMember(Member m1) {
        if (member.remove(m1)) {
            System.out.println("Member removed successfully: " + m1);
        } else {
            System.out.println("Failed to remove member.");
        }
    }

    public List<Book> searchBookbyTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book b : book) {
            if (title.equalsIgnoreCase(b.getTitle())) {
                result.add(b);
            }
        }
        return result;
    }

    public List<Book> searchBookbyAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book b : book) {
            if (author.equalsIgnoreCase(b.getAuthor())) {
                result.add(b);
            }
        }
        return result;
    }

    public List<Book> searchBookbyAvailability(boolean status) {
        List<Book> result = new ArrayList<>();
        for (Book b : book) {
            if (status == b.isAvailable()) {
                result.add(b);
            }
        }
        return result;
    }

    public Book searchBookbyISBN(long isbn) {
        for (Book b : book) {
            if (isbn == b.getISBN()) {
                return b;
            }
        }
        return null;
    }

    // Search for a member by name
    public List<Member> searchMembersByName(String name) {
        List<Member> result = new ArrayList<>();
        for (Member m : member) {
            if (m.getName().equalsIgnoreCase(name)) {
                result.add(m);
            }
        }
        return result;
    }

    // Search for a member by ID
    public Member searchMemberByID(int id) {
        for (Member m : member) {
            if (m.getID() == id) {
                return m;
            }
        }
        return null;
    }

    public void borrowBook(Book b1, Member m1) {
        if (!book.contains(b1)) {
            System.out.println("Book does not exist in the library.");
            return;
        }

        if (!member.contains(m1)) {
            System.out.println("Member does not exist in the library.");
            return;
        }

        if (b1.isAvailable()) {
            List<Book> borrowedBooks = m1.getBorrowedBooks();
            if (borrowedBooks == null) {
                borrowedBooks = new ArrayList<Book>();
            }
            borrowedBooks.add(b1);
            m1.setBorrowedBooks(borrowedBooks);
            b1.setAvailable(false);
            System.out.println("Book borrowed successfully: " + b1);
        } else {
            System.out.println(b1.getTitle() + " is unavailable.");
        }
    }

    public void returnBook(Book b1, Member m1) {
        if (!book.contains(b1)) {
            System.out.println("Book does not exist in the library.");
            return;
        }

        if (!member.contains(m1)) {
            System.out.println("Member does not exist in the library.");
            return;
        }

        List<Book> borrowedBooks = m1.getBorrowedBooks();
        if (borrowedBooks == null || !borrowedBooks.contains(b1)) {
            System.out.println("Book is not borrowed by this member.");
            return;
        }

        borrowedBooks.remove(b1);
        m1.setBorrowedBooks(borrowedBooks);
        b1.setAvailable(true);

        System.out.println("Book returned successfully: " + b1);
    }

    // Example method to print all books
    public void printAllBooks() {
        for (Book b : book) {
            System.out.println(b);
        }
    }

    // Example method to print all members
    public void printAllMembers() {
        for (Member m : member) {
            System.out.println(m);
        }
    }
}

class Repository<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class ProjectA {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books and members
        Book book1 = new Book("1984", "George Orwell", 1234567890123L, true);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1234567890124L, true);
        library.addBook(book1);
        library.addBook(book2);

        List<Book> borrowedBooks = new ArrayList<>();
        borrowedBooks.add(book1);
        Member member1 = new Member("John Doe", 1, borrowedBooks);
        library.addMember(member1);

        // Searching books
        List<Book> booksByTitle = library.searchBookbyTitle("1984");
        List<Book> booksByAuthor = library.searchBookbyAuthor("George Orwell");
        Book bookByISBN = library.searchBookbyISBN(1234567890123L);
        List<Book> availableBooks = library.searchBookbyAvailability(true);

        // Displaying search results
        System.out.println("Books by title '1984':");
        printResult(booksByTitle);

        System.out.println("Books by author 'George Orwell':");
        printResult(booksByAuthor);

        System.out.println("Book with ISBN 1234567890123:");
        System.out.println(bookByISBN);

        System.out.println("Available books:");
        printResult(availableBooks);

        // Borrowing a book
        library.borrowBook(book2, member1);

        // Returning a book
        library.returnBook(book1, member1);

        // Displaying all books and members
        System.out.println("All books in the library:");
        library.printAllBooks();

        System.out.println("All members in the library:");
        library.printAllMembers();
    }

    // Utility method to print results
    private static <T> void printResult(List<T> values) {
        for (T a : values) {
            System.out.println(a);
        }
    }
}
