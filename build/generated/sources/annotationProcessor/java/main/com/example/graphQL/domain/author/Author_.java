package com.example.graphQL.domain.author;

import com.example.graphQL.domain.book.Book;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Author.class)
public abstract class Author_ extends com.example.graphQL.core.generic.ExtendedEntity_ {

	public static volatile SingularAttribute<Author, String> firstName;
	public static volatile SingularAttribute<Author, String> lastName;
	public static volatile SetAttribute<Author, Book> books;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String BOOKS = "books";

}

