package com.example.graphQL.domain.book;

import com.example.graphQL.core.generic.ExtendedResolver;
import com.example.graphQL.domain.book.input.BookCreateInput;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMutationResolver extends ExtendedResolver<Book> implements GraphQLMutationResolver {

    private BookRepository bookRepository;

    @Autowired
    public BookMutationResolver(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(BookCreateInput bookCreateInput) {
        Book book = bookRepository.save(new Book(bookCreateInput.getTitle()));
        return findOrThrow(bookRepository.findById(book.getId()));
    }
}
