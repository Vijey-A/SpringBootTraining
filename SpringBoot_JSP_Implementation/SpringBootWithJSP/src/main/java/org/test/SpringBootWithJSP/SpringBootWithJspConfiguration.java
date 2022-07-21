package org.test.SpringBootWithJSP;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.test.SpringBootWithJSP.repository.BookRepository;
import org.test.SpringBootWithJSP.repository.impl.InMemoryBookRepository;
import org.test.SpringBootWithJSP.repository.model.BookData;

@Configuration
public class SpringBootWithJspConfiguration {
    @Bean
    public BookRepository provideBookRepository() {
        return new InMemoryBookRepository(initialBookData());
    }
    private static Map<String, BookData> initialBookData() {
        Map<String, BookData> initData = new HashMap<>();
        initData.put("ISBN-1", new BookData("ISBN-1", "Book 1", "Book 1 Author"));
        initData.put("ISBN-2", new BookData("ISBN-2", "Book 2", "Book 2 Author"));
        initData.put("ISBN-3", new BookData("ISBN-3", "Book 3", "Book 3 Author"));
        return initData;
    }
}