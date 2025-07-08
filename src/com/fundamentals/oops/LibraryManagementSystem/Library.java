package com.fundamentals.oops.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private static final long BASE_CHARGE_PER_DAY = 10;
    private List<Book> books = new ArrayList<>();
    private List<User> users;
    private List<Transaction> transactions = new ArrayList<>();
    private Librarian librarian;

    public Library(){}

    public Library(List<Book> books, List<User> users, List<Transaction> transactions, Librarian librarian) {
        this.books = books;
        this.users = users;
        this.transactions = transactions;
        this.librarian = librarian;
    }

    public Optional<Book> findBookAvailabilityByTitle(String title){
        return books.stream().filter(book -> book.getTitle().equalsIgnoreCase(title) && book.getStatus() == Status.AVAILABLE).findFirst();
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    public void addBook(Book book){
        books.add(book);
    }

    public Optional<Transaction> findActiveTransaction(Book book, User user) {
        return transactions.stream()
                .filter(t -> t.getBook() == book && t.getUser() == user && !t.isReturned())
                .findFirst();
    }
}
