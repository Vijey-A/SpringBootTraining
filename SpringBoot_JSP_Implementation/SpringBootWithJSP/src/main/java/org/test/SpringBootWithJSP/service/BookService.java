package org.test.SpringBootWithJSP.service;

import java.util.Collection;
import org.test.SpringBootWithJSP.dto.Book;

public interface BookService {
    Collection<Book> getBooks();

    Book addBook(Book book);
}
