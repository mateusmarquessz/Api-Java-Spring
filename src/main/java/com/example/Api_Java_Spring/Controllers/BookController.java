package com.example.Api_Java_Spring.Controllers;

import com.example.Api_Java_Spring.domain.Book;
import com.example.Api_Java_Spring.services.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return ResponseEntity.ok().body(books);
    }

    @PostMapping("")
    public ResponseEntity<Book> registerBook(@RequestBody Book book) {
        Book newBook = this.service.registerBook(book);
        return ResponseEntity.ok().body(newBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable("id") Long id) {
        this.service.deleteBookById(id);
        return ResponseEntity.noContent().build();
    }
}
