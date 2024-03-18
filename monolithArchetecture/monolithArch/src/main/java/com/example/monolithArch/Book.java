package com.example.monolithArch;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String isbn;
    private double price;

    // Constructors, getters, setters, and toString method...

    // Constructors...
    
    public Book() {
        super();
    }

    public Book(String title, String isbn, double price) {
        super();
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }

    // Getters and setters...

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method...

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + ", price=" + price + "]";
    }
}
