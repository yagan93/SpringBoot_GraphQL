package com.example.graphQL.domain.author.specification;

import com.example.graphQL.domain.author.Author;
import com.example.graphQL.domain.author.Author_;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class AuthorSpecifications {
    public Specification<Author> hasAuthorFirstName(String firstName) {
        return (root, query, builder) -> builder.equal(root.get(Author_.FIRST_NAME), firstName);
    }
}