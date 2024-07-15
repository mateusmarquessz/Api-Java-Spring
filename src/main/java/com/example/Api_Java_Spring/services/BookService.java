package com.example.Api_Java_Spring.services;


import com.example.Api_Java_Spring.domain.Book;
import com.example.Api_Java_Spring.feign.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookClient bookClient;

    public BookService(BookClient client) {
        this.bookClient = client;
    }

    public List<Book> getBooksFromLibrary() {
        return this.bookClient.getBooks();
    }
}
