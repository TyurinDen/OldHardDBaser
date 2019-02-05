package com.github.tyurinden.oldharddbaser.exceptions;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
