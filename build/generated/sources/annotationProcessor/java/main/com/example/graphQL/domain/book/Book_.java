package com.example.graphQL.domain.book;

import com.example.graphQL.domain.author.Author;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Book.class)
public abstract class Book_ extends com.example.graphQL.core.generic.ExtendedEntity_ {

	public static volatile SingularAttribute<Book, Float> price;
	public static volatile SingularAttribute<Book, Author> author;
	public static volatile SingularAttribute<Book, String> title;

	public static final String PRICE = "price";
	public static final String AUTHOR = "author";
	public static final String TITLE = "title";

}

