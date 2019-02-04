package com.github.tyurinden.oldharddbaser.controllers;

import com.github.tyurinden.oldharddbaser.db.dao.BookRepository;
import com.github.tyurinden.oldharddbaser.db.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public Iterable getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/title/{bookTitle}")
    public List findBookByTitle(@PathVariable String bookTitle) {
        return bookRepository.getBookByTitle(bookTitle);
    }

    @GetMapping("/{id}")
    public Book findBookById(@PathVariable Long id) {
        return bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable Long id) {
        bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
        bookRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable Long id) {
        if (book.getId() != id) {
            throw new BookMismatchException();
        }
        bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
        return bookRepository.save(book);
    }
}
