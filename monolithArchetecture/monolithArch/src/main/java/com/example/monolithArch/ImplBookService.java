package com.example.monolithArch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImplBookService implements BookService {
    private final bookRepository bookRepository;

    @Autowired
    public ImplBookService(bookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllExpensive() {
        List<Book> expensiveBooks = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getPrice() > 30000) {
                expensiveBooks.add(book);
            }
        }
        return expensiveBooks;
    }

    @Override
    public List<String> getTitleBooks() {
        List<String> bookTitles = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            bookTitles.add(book.getTitle());
        }
        return bookTitles;
    }

    @Override
    public void addBook(Book book) {
        try {
            bookRepository.save(book);
        } catch (Exception e) {
            throw e;
        }
    }
}
