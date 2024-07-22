package com.example.deneme.Controller;

import com.example.deneme.Model.Book;
import com.example.deneme.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/getBooks")
    public List<Book>  getBooks(){
        return bookRepository.findAll();
    }
}
