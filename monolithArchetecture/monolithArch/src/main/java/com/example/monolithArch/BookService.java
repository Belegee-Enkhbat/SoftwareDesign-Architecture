package com.example.monolithArch;


import java.util.List;;

public interface BookService {
    List<Book> getAllExpensive();
    List<String> getTitleBooks();
    void addBook(Book book);
}