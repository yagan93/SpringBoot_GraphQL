package com.example.graphQL.domain.author;

import com.example.graphQL.core.GraphQLPagination;
import com.example.graphQL.core.generic.ExtendedResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class AuthorQueryResolver extends ExtendedResolver<Author> implements GraphQLQueryResolver {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorQueryResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findAllAuthors(GraphQLPagination pagination) {
        return authorRepository.findAll(pagination.build()).getContent();
    }

    public Author findAuthorById(String id) {
        return findOrThrow(authorRepository.findById(UUID.fromString(id)));
    }
}
