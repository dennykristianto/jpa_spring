package com.mitrais.carrot.controller;

import com.mitrais.carrot.model.Book;
import com.mitrais.carrot.model.Staff;
import com.mitrais.carrot.services.BookServices;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    BookServices bookServices;

    public BookController(BookServices bookServices) {
        this.bookServices = bookServices;
    }

    @GetMapping
    public List<Book> findAll(){
        return bookServices.findAll();
    }

    @PostMapping
    public void insert(@RequestBody Book book){
        book.setStaff(new HashSet<>());
        bookServices.create(book);
    }
}
