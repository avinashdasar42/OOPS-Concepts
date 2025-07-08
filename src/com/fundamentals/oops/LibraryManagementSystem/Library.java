package com.fundamentals.oops.LibraryManagementSystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private static final long BASE_CHARGE_PER_DAY = 10;
    private List<Book> books;
    private Librarian librarian;

    private List<Transaction> transactions = new ArrayList<>();

    public Library(List<Book> books, Librarian librarian) {
        this.books = books;
        this.librarian = librarian;
    }

    public void returnBook(Book book) {
        System.out.println("Book returning: "+book);
        System.out.println("Collected By: "+librarian.getName());
        System.out.println("Total charges: "+calculateFees(LocalDate.of(2025,7,15)));
        book.setStatus(Status.AVAILABLE);
    }

    public double calculateFees(LocalDate returnDate) {
        double fees = 0;
        for (Transaction t : transactions){
            if(returnDate.isAfter(t.getDueDate())){
                long days = ChronoUnit.DAYS.between(t.getDueDate(), returnDate);
                fees += days * 100;
            }
            long days = ChronoUnit.DAYS.between(t.getDueDate(), t.getIssueDate());
            fees += days * BASE_CHARGE_PER_DAY;
        }
        return fees;
    }

    public Book issueBook(User user, String bookId) {
        for (Book b : books){
            if(b.getIsbn().equals(bookId) && b.getStatus() == Status.AVAILABLE){
                Transaction t = new Transaction(b,LocalDate.now(), LocalDate.now().plusDays(5));
                transactions.add(t);
                b.setStatus(Status.UNAVAILABLE);
                return b;
            }
        }
        return null;
    }
}
