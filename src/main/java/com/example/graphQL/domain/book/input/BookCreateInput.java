package com.example.graphQL.domain.book.input;

import java.util.UUID;

public class BookCreateInput {
    private String title;

    private Double price;

    private UUID authorId;

    public BookCreateInput() {
    }

    public BookCreateInput(String title, Double price, UUID authorId) {
        this.title = title;
        this.price = price;
        this.authorId = authorId;
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

    public UUID getAuthorId() {
        return authorId;
    }

    public void setAuthorId(UUID author) {
        this.authorId = author;
    }
}
