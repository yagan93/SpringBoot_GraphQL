package com.example.graphQL.domain.author;

import com.example.graphQL.core.generic.ExtendedResolver;
import com.example.graphQL.domain.author.input.AuthorCreateInput;
import com.example.graphQL.domain.author.input.AuthorMapper;
import com.example.graphQL.domain.book.Book;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class AuthorMutationResolver extends ExtendedResolver<Author> implements GraphQLMutationResolver {

    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Autowired
    public AuthorMutationResolver(AuthorRepository authorRepository, AuthorMapper authorMapper) {
        this.authorRepository = authorRepository;
        this.authorMapper = authorMapper;
    }

    @Transactional
    public Author createAuthor(AuthorCreateInput authorCreateInput) {
        Author cachedAuthor = authorMapper.fromDTO(authorCreateInput);
        Set<Book> detachedBooks = cachedAuthor.getBooks();
        Author createdAuthor = authorRepository.save(cachedAuthor.setBooks(new HashSet<>()));
        return authorRepository.save(createdAuthor.setBooks(detachedBooks.stream().map(book -> book.setAuthor(createdAuthor))
                .collect(Collectors.toSet())));
    }

    @Transactional
    public String deleteAuthor(String id) {
        if (authorRepository.existsById(UUID.fromString(id))) {
            authorRepository.deleteById(UUID.fromString(id));
        } else {
            throw new NoSuchElementException(String.format("Entity with ID '%s' could not be found", id));
        }
        return id;
    }
}