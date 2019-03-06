package com.mitrais.carrot.services;

import com.mitrais.carrot.model.Book;

import java.util.List;

public interface BookServices {
    public void create(Book book);

    public List<Book> findAll();
}
