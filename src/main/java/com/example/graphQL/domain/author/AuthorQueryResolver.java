package com.example.graphQL.domain.author;

import com.example.graphQL.core.GraphQLPagination;
import com.example.graphQL.core.generic.ExtendedResolver;
import com.example.graphQL.domain.author.specification.CustomerSpecifications;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class AuthorQueryResolver extends ExtendedResolver<Author> implements GraphQLQueryResolver {

    private AuthorRepository authorRepository;
    private CustomerSpecifications customerSpecifications;

    @Autowired
    public AuthorQueryResolver(AuthorRepository authorRepository, CustomerSpecifications customerSpecifications) {
        this.authorRepository = authorRepository;
        this.customerSpecifications = customerSpecifications;
    }

    public List<Author> findAllAuthors(GraphQLPagination pagination) {
        return authorRepository.findAll(pagination.build()).getContent();
    }

    public Author findAuthorById(String id) {
        return findOrThrow(authorRepository.findById(UUID.fromString(id)));
    }

    public List<Author> findAuthorByFirstName(String firstname) {
        return authorRepository.findAll(customerSpecifications.hasAuthorFirstName(firstname));
    }
}
