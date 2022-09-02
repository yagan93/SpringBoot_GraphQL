package com.example.graphQL.domain.book;

import com.example.graphQL.core.generic.ExtendedResolver;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMutationResolver extends ExtendedResolver<Book> implements GraphQLMutationResolver {

    @Autowired
    public BookMutationResolver() {
    }

}
