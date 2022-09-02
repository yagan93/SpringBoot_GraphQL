package com.example.graphQL.domain.author.input;

import com.example.graphQL.domain.book.input.BookCreateInput;

import java.util.Set;

public class AuthorCreateInput {
    private String firstName;
    private String lastName;
    private Set<BookCreateInput> books;

    public AuthorCreateInput() {
    }

    public AuthorCreateInput(String firstName, String lastName, Set<BookCreateInput> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public AuthorCreateInput setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public AuthorCreateInput setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Set<BookCreateInput> getBooks() {
        return books;
    }

    public AuthorCreateInput setBooks(Set<BookCreateInput> books) {
        this.books = books;
        return this;
    }
}
