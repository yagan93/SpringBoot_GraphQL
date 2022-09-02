package com.example.graphQL.domain.book;

import com.example.graphQL.core.generic.ExtendedResolver;
import com.example.graphQL.domain.author.Author;
import com.example.graphQL.domain.author.AuthorQueryResolver;
import com.example.graphQL.domain.book.input.BookCreateInput;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMutationResolver extends ExtendedResolver<Book> implements GraphQLMutationResolver {

    private final BookRepository bookRepository;
    private final AuthorQueryResolver authorQueryResolver;

    @Autowired
    public BookMutationResolver(BookRepository bookRepository, AuthorQueryResolver authorQueryResolver) {
        this.bookRepository = bookRepository;
        this.authorQueryResolver = authorQueryResolver;
    }

    public Book createBook(BookCreateInput bookCreateInput) {
        Author author = authorQueryResolver.findAuthorById(String.valueOf(bookCreateInput.getAuthorId()));

        Book book = bookRepository.save(new Book(bookCreateInput.getTitle(), bookCreateInput.getPrice(), author));

        return findOrThrow(bookRepository.findById(book.getId()));
    }
}
