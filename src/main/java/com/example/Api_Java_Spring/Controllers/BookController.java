package com.example.Api_Java_Spring.Controllers;

import com.example.Api_Java_Spring.domain.Book;
import com.example.Api_Java_Spring.services.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> books = this.service.getBooksFromLibrary();
        System.out.println(books);
        return ResponseEntity.ok().body(books);
    }
}
