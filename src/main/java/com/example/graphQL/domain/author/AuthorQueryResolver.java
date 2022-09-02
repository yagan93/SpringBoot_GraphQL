package com.example.graphQL.domain.author;

import com.example.graphQL.core.generic.ExtendedResolver;
import com.example.graphQL.core.pagination.Pagination;
import com.example.graphQL.domain.author.specification.AuthorSpecifications;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class AuthorQueryResolver extends ExtendedResolver<Author> implements GraphQLQueryResolver {

    private final AuthorRepository authorRepository;
    private final AuthorSpecifications authorSpecifications;

    @Autowired
    public AuthorQueryResolver(AuthorRepository authorRepository, AuthorSpecifications authorSpecifications) {
        this.authorRepository = authorRepository;
        this.authorSpecifications = authorSpecifications;
    }

    public List<Author> findAllAuthors(Pagination pagination) {
        Page<Author> pagedResult = authorRepository.findAll(pagination.build());
        return pagedResult.hasContent() ? pagedResult.getContent() : new ArrayList<>();
    }

    public List<Author> findAllAuthorsByFirstName(String firstName) {
        return authorRepository.findAll(authorSpecifications.hasAuthorFirstName(firstName));
    }

    public Author findAuthorById(String id) {
        return findOrThrow(authorRepository.findById(UUID.fromString(id)));
    }
}
