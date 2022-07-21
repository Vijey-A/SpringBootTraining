package org.test.SpringBootWithJSP.service.impl;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import org.test.SpringBootWithJSP.dto.Book;
import org.test.SpringBootWithJSP.exception.DuplicateBookException;
import org.test.SpringBootWithJSP.repository.BookRepository;
import org.test.SpringBootWithJSP.repository.model.BookData;
import org.test.SpringBootWithJSP.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Collection<Book> getBooks() {
        return bookRepository.findAll()
                .stream()
                .map(BookServiceImpl::convertBookData)
                .collect(Collectors.toList());
    }

    @Override
    public Book addBook(Book book) {
        final Optional<BookData> existingBook = bookRepository.findById(book.getIsbn());
        if (existingBook.isPresent()) {
            throw new DuplicateBookException(book);
        }

        final BookData savedBook = bookRepository.add(convertBook(book));
        return convertBookData(savedBook);
    }

    private static Book convertBookData(BookData bookData) {
        return new Book(bookData.getIsbn(), bookData.getName(), bookData.getAuthor());
    }

    private static BookData convertBook(Book book) {
        return new BookData(book.getIsbn(), book.getName(), book.getAuthor());
    }
}