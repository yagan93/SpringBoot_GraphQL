package com.example.graphQL.domain.book;

import com.example.graphQL.core.generic.ExtendedEntity;
import com.example.graphQL.domain.author.Author;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book extends ExtendedEntity {

    @Column(name = "title", unique = true, nullable = false)
    private String title;

    @Column(name = "price", nullable = false)
    private Float price;

    @ManyToOne()
    @JoinColumn(name = "author_id", referencedColumnName = "id", nullable = false)
    @JsonBackReference
    private Author author;

    public Book() {
    }

    public Book(String title, Float price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public Float getPrice() {
        return price;
    }

    public Book setPrice(Float price) {
        this.price = price;
        return this;
    }

    public Author getAuthor() {
        return author;
    }

    public Book setAuthor(Author author) {
        this.author = author;
        return this;
    }
}
