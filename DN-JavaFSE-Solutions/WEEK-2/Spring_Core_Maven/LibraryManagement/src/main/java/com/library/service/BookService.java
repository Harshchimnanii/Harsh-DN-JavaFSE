package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String serviceName;

    // Constructor Injection (For Exercise 7)
    public BookService(String serviceName) {
        this.serviceName = serviceName;
        System.out.println("Constructor Injection: BookService created with name: " + serviceName);
    }

    // Setter Injection (For Exercise 2 and 7)
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection: BookRepository injected into BookService.");
    }

    public void manageBook() {
        System.out.println("BookService: Managing books using " + serviceName);
        bookRepository.save();
    }
}