package org.test.SpringBootWithJSP.exception;

import lombok.Getter;
import org.test.SpringBootWithJSP.dto.Book;

@Getter
public class DuplicateBookException extends RuntimeException {
    private final Book book;

    public DuplicateBookException(Book book) {
        this.book = book;
    }
}