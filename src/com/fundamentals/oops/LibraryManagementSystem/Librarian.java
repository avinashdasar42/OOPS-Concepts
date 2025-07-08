package com.fundamentals.oops.LibraryManagementSystem;

import java.time.LocalDate;
import java.util.Optional;

public class Librarian extends User{
    private String id;
    public Librarian(String name, int age, String contact, String id) {
        super(name, age, contact);
        this.id = id;
    }

    public boolean issueBook(Library library, User user, Book book) {
        Optional<Book> optionalBook = library.findBookAvailabilityByTitle(book.getTitle());

        if (optionalBook.isPresent()) {
            Book bookFound = optionalBook.get();
            bookFound.setStatus(Status.UNAVAILABLE);

            Transaction transaction = new Transaction(book, user);
            library.addTransaction(transaction);

            System.out.println("Book issued to " + user.getName());
            return true;
        } else {
            System.out.println("Book not available");
            return false;
        }
    }

    public boolean returnBook(Library library, User user, Book book) {
        Optional<Transaction> optionalTransaction = library.findActiveTransaction(book, user);

        if (optionalTransaction.isPresent()) {
            Transaction transaction = optionalTransaction.get();
            transaction.returnBook();
            book.setStatus(Status.AVAILABLE);

            double charges = transaction.calculateFees();
            System.out.println("Book returned by " + user.getName());
            System.out.println("Late Charges: ₹" + charges);
            return true;
        } else {
            System.out.println("No active transaction found for this book and member.");
            return false;
        }
    }

    public String getId() {
        return id;
    }
}
