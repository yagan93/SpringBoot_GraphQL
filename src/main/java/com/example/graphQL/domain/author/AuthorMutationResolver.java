package com.example.graphQL.domain.author;

import com.example.graphQL.core.generic.ExtendedResolver;
import com.example.graphQL.domain.author.input.AuthorCreateInput;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorMutationResolver extends ExtendedResolver<Author> implements GraphQLMutationResolver {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorMutationResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author createAuthor(AuthorCreateInput authorCreateInput) {
        Author author = authorRepository.save(new Author(authorCreateInput.getFirstName(), authorCreateInput.getLastName()));
        return findOrThrow(authorRepository.findById(author.getId()));
    }
}