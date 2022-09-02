package com.example.graphQL.domain.book;

import com.example.graphQL.core.generic.ExtendedEntity;
import com.example.graphQL.domain.author.Author;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class Book extends ExtendedEntity {

    @Column(name = "title", unique = true)
    private String title;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;


    public Book() {
    }

    public Book(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public Book(UUID id, String title, Double price, Author author) {
        super(id);
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
