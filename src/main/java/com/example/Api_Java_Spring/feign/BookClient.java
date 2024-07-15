package com.example.Api_Java_Spring.feign;

import com.example.Api_Java_Spring.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(name = "book-api", url = "https://estudos-api-livros-aws.s3.us-east-2.amazonaws.com")
public interface BookClient {

    @GetMapping("/books.json")
    List<Book> getBooks();
}
