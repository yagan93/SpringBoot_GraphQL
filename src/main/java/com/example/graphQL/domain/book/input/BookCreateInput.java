package com.example.graphQL.domain.book.input;

public class BookCreateInput {
    private String title;

    public BookCreateInput() {
    }

    public BookCreateInput(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
