package com.example.Application.Controllers;

import com.example.Application.Entities.Book;
import com.example.Application.Repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/aman")
public class Request {
    private BookRepository bookRepository;

    @Autowired
    public void Request(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/getBook")
    public ResponseEntity<List<Book>> fetch() {
        List<Book> books = bookRepository.findAll();
        log.info("Got these books! {}", books);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/favGame")
    public String fetchGame(){
        return "Aman loves cricket";
    }



}
