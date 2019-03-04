package com.mitrais.carrot.services;

import com.mitrais.carrot.interfaces.BookRepository;
import com.mitrais.carrot.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {
    private BookRepository bookRepository;

    public BookServices(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void create(Book book){
        bookRepository.save(book);
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }
}
