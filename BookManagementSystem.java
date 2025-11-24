package GuviTask3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n1. Add Book\n2. Remove Book\n3. Display Books\n4. Search Book\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Is Available? (true/false): ");
                    boolean avail = sc.nextBoolean();
                    Book book = new Book(id, title, author, avail);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = sc.nextInt();
                    library.removeBook(removeId);
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();
                    Book found = library.searchBook(searchId);
                    if (found != null) {
                        System.out.println(found.toString());
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

class Library{
    final ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void removeBook(int bookID) {
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.getBookID() == bookID) {
                it.remove();
                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books to display.");
            return;
        }
        for (Book b : books) {
            System.out.println(b.toString());
        }
    }

    public Book searchBook(int bookID) {
        for (Book b : books) {
            if (b.getBookID() == bookID) {
                return b;
            }
        }
        return null;
    }


}

class Book{
    //Book attributes
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    //Constructor to initialize book attributes
    public Book(int bookID, String title, String author, boolean isAvailable){
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable=isAvailable;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAvailable(boolean available){
        isAvailable = available;
    }

    public String toString() {
        return "BookID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}
