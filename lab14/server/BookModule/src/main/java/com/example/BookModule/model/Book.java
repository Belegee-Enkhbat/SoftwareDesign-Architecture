package com.example.BookModule.model;

public class Book {
	   private int id;
	   private String bookName;
	   private int price;

	    public Book() {
	    }

	    public Book(int id, String bookName, int price) {
	        this.id = id;
	        this.bookName = bookName;
	        this.price = price;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getBookName() {
	        return bookName;
	    }

	    public void setBookName(String bookName) {
	        this.bookName = bookName;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }
}
