package com.fundamentals.oops.LibraryManagementSystem;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String category;
    private Status status;

    public Book(String isbn, String title, String author, Status status){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.category = category;
        this.status = status;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '}';
    }
}
