package com.example.catalogservice.domain;

public class BookAlreadyException extends RuntimeException {
    public BookAlreadyException(String isbn) {
        super("A book with ISBN " + isbn + " already exists.");
    }
}
