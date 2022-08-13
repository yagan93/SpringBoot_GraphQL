package com.example.graphQL.domain.book;

import com.example.graphQL.core.generic.ExtendedResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class BookQueryResolver extends ExtendedResolver<Book> implements GraphQLQueryResolver {

    private BookRepository bookRepository;

    @Autowired
    public BookQueryResolver(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findBookById(String id) {
        return findOrThrow(bookRepository.findById(UUID.fromString(id)));
    }
}
