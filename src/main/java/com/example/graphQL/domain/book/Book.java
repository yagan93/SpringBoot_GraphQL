package com.example.graphQL.domain.book;

import com.example.graphQL.core.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class Book extends ExtendedEntity {

    @Column(name = "title", unique = true)
    private String title;

    private Double price;

    public Book() {
    }

    public Book(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public Book(UUID id, String title, Double price) {
        super(id);
        this.title = title;
        this.price = price;
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
}
