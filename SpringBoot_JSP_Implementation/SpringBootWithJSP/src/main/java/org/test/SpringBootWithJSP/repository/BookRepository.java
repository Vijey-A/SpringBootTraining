package org.test.SpringBootWithJSP.repository;

import java.util.Collection;
import java.util.Optional;
import org.test.SpringBootWithJSP.repository.model.BookData;

public interface BookRepository {
    Collection<BookData> findAll();

    Optional<BookData> findById(String isbn);

    BookData add(BookData book);
}