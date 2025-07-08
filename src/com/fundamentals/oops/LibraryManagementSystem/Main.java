package com.fundamentals.oops.LibraryManagementSystem;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("Peter Parker",30, "1234567","LIB123");
        Book book1 = new Book("JAVA123","Java Basics","Programming",Status.AVAILABLE);
        Book book2 = new Book("JAVA123","Head First Java","Programming",Status.AVAILABLE);
        Book book3 = new Book("C123","Head First C","Programming",Status.AVAILABLE);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        User user = new Student("Avinash",28,"123456789","STU123");

        librarian.issueBook(library, user,book1);

        // simulate delay if needed
        librarian.returnBook(library, user, book1);
    }
}
