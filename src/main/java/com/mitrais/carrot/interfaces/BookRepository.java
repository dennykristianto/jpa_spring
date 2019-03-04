package com.mitrais.carrot.interfaces;

import com.mitrais.carrot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
