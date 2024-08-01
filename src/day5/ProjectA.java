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
	private Map<Member, List<Book>> borrowBook;
	private Map<Member, List<Book>> returnBook;

	public Library() {
		book = new ArrayList<Book>();
		member = new HashSet<Member>();
		borrowBook = new HashMap<Member, List<Book>>();
		returnBook = new HashMap<Member, List<Book>>();
	}

	public void addBook(Book b1) {
		if (book.add(b1)) {
			System.out.println("Success");
		} else {
			System.out.println("Failed");
		}
	}

	public void addMember(Member m1) {
		if (member.add(m1)) {
			System.out.println("Success");
		} else {
			System.out.println("Failed");
		}
	}

	public void removeBook(Book b1) {
		if (book.remove(b1)) {
			System.out.println("Success");
		} else {
			System.out.println("Failed");
		}
	}

	public void removeMember(Member m1) {
		if (member.remove(m1)) {
			System.out.println("Success");
		} else {
			System.out.println("Failed");
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
		for (Member member : member) {
			if (member.getName().equalsIgnoreCase(name)) {
				result.add(member);
			}
		}
		return result;
	}

	// Search for a member by ID
	public Member searchMemberByID(int id) {
		for (Member member : member) {
			if (member.getID() == id) {
				return member;
			}
		}
		return null;
	}

	public void borrowBook(Book b1, Member m1) {
		if (b1.isAvailable()) {
			List<Book> newBook = m1.getBorrowedBooks();
			if (newBook == null) {
				newBook = new ArrayList<Book>();
			}
			newBook.add(b1);
			m1.setBorrowedBooks(newBook);
			b1.setAvailable(false);
			System.out.println("Book borrowed successfully.");
		} else {
			System.out.println(b1.getTitle() + " is Unavailable");
		}
	}

	// Example method to print all books
	public void printAllBooks() {
		for (Book book : book) {
			System.out.println(book);
		}
	}

	// Example method to print all members
	public void printAllMembers() {
		for (Member member : member) {
			System.out.println(member);
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

		// Searching members
		List<Member> membersByName = library.searchMembersByName("John Doe");
		Member memberByID = library.searchMemberByID(1);

		printResult(membersByName);
	}

	private static <T> void printResult(List<T> values) {
		for (T a : values) {
			System.out.println(a);
		}
	}
}
