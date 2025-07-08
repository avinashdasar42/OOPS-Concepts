package com.fundamentals.oops.LibraryManagementSystem;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Student Or Faculty
        User student = new Student("John",22,"1234567890","STU123");
        User faculty = new Faculty("Jane",25,"1234567890","FAC123");
        // Librarian
        Librarian librarian = new Librarian("Peter",30,"234521244","LIB123");
        // Books
        Book b1 = new Book("ISBN123","Head First Java","Jane Doe","Programming",Status.AVAILABLE);
        Book b2 = new Book("ISBN124","Head First C","Jane Doe","Programming",Status.UNAVAILABLE);
        Book b3 = new Book("ISBN125","Ikigai","Nakamura","Motivational",Status.AVAILABLE);
        List<Book> books = Arrays.asList(b1,b2,b3);

        Library library = new Library(books,librarian);

//        Scenario 1: Issue Book to User
        Book bookIssued1 = library.issueBook(student, b1.getIsbn());
        if(bookIssued1 == null){
            System.out.println(b1.getTitle() + " is not available currently... for "+ student.getName());
        }
        System.out.println("Book: "+bookIssued1.getTitle()+" issued to User: "+student.getName());

//      Scenario 2: Trying to request Same Book
        Book bookIssued3 = library.issueBook(faculty, b1.getIsbn());
        if(bookIssued3 == null){
            System.out.println(b1.getTitle() + " is not available currently..."+faculty.getName());
        }

//        User wants to return Book
        library.returnBook(bookIssued1);

//        Scenario 3
//        Trying to access Unavailable Book
//        Book bookIssued2 = library.issueBook(user, b2.getIsbn());
//        if(bookIssued2 == null){
//            System.out.println(b2.getTitle() + " is not available currently...");
//        }

//        Scenario 4: trying to request same book after returned
        Book bookIssued4 = library.issueBook(faculty, b1.getIsbn());
        if(bookIssued4 == null){
            System.out.println(b1.getTitle() + " is not available currently... for "+ faculty.getName());
        }
        System.out.println("Book: "+bookIssued4.getTitle()+" issued to User: "+faculty.getName());


    }
}
