package com.example.graphQL.domain.book;

import com.example.graphQL.core.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class Book extends ExtendedEntity {

    @Column(name = "title", unique = true)
    private String title;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(UUID id, String title) {
        super(id);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
