package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Loading the Spring Context from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Spring Context Loaded Successfully!\n");

        // Fetching the configured bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Testing the setup
        bookService.manageBook();
    }
}