package com.fundamentals.oops.LibraryManagementSystem;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Transaction {
//    private static final double BASE_CHARGE_PER_DAY = 10;
    private Book book;
    private LocalDate issueDate;
    private LocalDate dueDate;

    public Transaction(Book book, LocalDate issueDate, LocalDate dueDate){
        this.book = book;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

//    public double calculateBill(LocalDate returnDate){
//        double fees = 0;
//        if(returnDate.isAfter(dueDate)){
//            long days = ChronoUnit.DAYS.between(dueDate, returnDate);
//            fees += days * 100;
//        }
//        long days = ChronoUnit.DAYS.between(issueDate, dueDate);
//        return fees + days * BASE_CHARGE_PER_DAY;
//    }
}
