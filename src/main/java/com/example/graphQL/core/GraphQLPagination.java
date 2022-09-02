package com.example.graphQL.core;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class GraphQLPagination {
    private final int page;
    private final int limit;

    public GraphQLPagination(int page, int limit) {
        this.page = page;
        this.limit = limit;
    }

    public Pageable build() {
        return PageRequest.of(page, limit);
    }

}
