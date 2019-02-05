package com.github.tyurinden.oldharddbaser.exceptions;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException() {
        super();
    }

    public BookNotFoundException(String message) {
        super(message);
    }

    public BookNotFoundException(Throwable cause) {
        super(cause);
    }

    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
