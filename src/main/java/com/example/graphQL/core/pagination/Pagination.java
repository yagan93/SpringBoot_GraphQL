package com.example.graphQL.core.pagination;

import com.example.graphQL.core.generic.ExtendedEntity_;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class Pagination {
    private final int page;
    private final int limit;

    public Pagination(int page, int limit) {
        this.page = page;
        this.limit = limit;
    }

    public Pageable build() {
        return PageRequest.of(page, limit, Sort.by(ExtendedEntity_.ID));
    }
}
