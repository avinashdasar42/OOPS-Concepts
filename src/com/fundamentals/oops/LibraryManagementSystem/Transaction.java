package com.fundamentals.oops.LibraryManagementSystem;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Transaction {
    private static final double BASE_CHARGE_PER_DAY = 10;
    private Book book;
    private User user;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public Transaction(Book book, User user){
        this.book = book;
        this.user = user;
        this.issueDate = LocalDate.now();
    }

    public void returnBook(){
        this.returnDate = LocalDate.now();
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public User getUser() {
        return user;
    }

    public boolean isReturned(){
        return returnDate != null;
    }

    public double calculateFees() {
        long days = ChronoUnit.DAYS.between(issueDate, returnDate != null ? returnDate : LocalDate.now());
        return days > 7 ? (days - 7) * 10 : 0.0; // First 7 days free, then ₹10/day
    }
}
