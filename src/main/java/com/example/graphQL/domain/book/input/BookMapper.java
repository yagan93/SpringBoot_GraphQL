package com.example.graphQL.domain.book.input;

import com.example.graphQL.core.generic.ExtendedMapper;
import com.example.graphQL.domain.book.Book;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BookMapper extends ExtendedMapper<Book, BookCreateInput> {
}

