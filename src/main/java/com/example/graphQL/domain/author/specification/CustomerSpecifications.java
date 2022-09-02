package com.example.graphQL.domain.author.specification;


import com.example.graphQL.domain.author.Author_;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class CustomerSpecifications<T> {
    public Specification<T> hasAuthorFirstName(String firstName) {
        return (root, query, builder) -> builder.equal(root.get(Author_.FIRST_NAME), firstName);
    }
}