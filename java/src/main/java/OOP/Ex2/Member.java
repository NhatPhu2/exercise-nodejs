package Ex2;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private List<Book> borrowedBooks;

    public Member(String name) {
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.getQuantity() > 0) {
            borrowedBooks.add(book);
            book.setQuantity(book.getQuantity() - 1);
            System.out.println(name + " has borrowed the book: " + book.getTitle());
        } else {
            System.out.println("The book is currently not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setQuantity(book.getQuantity() + 1);
            System.out.println(name + " has returned the book: " + book.getTitle());
        } else {
            System.out.println("You have not borrowed this book.");
        }
    }

    public void displayBorrowedBooks() {
        System.out.println(name + "'s borrowed books:");
        for (Book book : borrowedBooks) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
        System.out.println();
    }
}
