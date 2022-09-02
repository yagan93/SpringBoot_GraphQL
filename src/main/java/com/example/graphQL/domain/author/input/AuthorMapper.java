package com.example.graphQL.domain.author.input;

import com.example.graphQL.core.generic.ExtendedMapper;
import com.example.graphQL.domain.author.Author;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthorMapper extends ExtendedMapper<Author, AuthorCreateInput> {
}
