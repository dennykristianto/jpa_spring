package com.mitrais.carrot.services.implementation;

import com.mitrais.carrot.interfaces.BookRepository;
import com.mitrais.carrot.model.Book;
import com.mitrais.carrot.services.BookServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServicesImpl implements BookServices {
    private BookRepository bookRepository;

    public BookServicesImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void create(Book book){
        bookRepository.save(book);
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }
}
