package com.github.tyurinden.oldharddbaser.db.dao;

import com.github.tyurinden.oldharddbaser.db.models.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> getBookByTitle(String title);
}
