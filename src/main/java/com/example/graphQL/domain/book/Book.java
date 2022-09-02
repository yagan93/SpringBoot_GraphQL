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

    @ManyToOne
    @JoinColumn(name="author_id", nullable=false)
    private Author author;


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
