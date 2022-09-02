package com.example.graphQL.domain.book.input;

public class BookCreateInput {
    private String title;
    private Double price;

    public BookCreateInput() {
    }

    public BookCreateInput(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public BookCreateInput setTitle(String title) {
        this.title = title;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public BookCreateInput setPrice(Double price) {
        this.price = price;
        return this;
    }

}
