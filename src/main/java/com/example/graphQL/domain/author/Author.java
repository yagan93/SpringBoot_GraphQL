package com.example.graphQL.domain.author;

import com.example.graphQL.core.generic.ExtendedEntity;
import com.example.graphQL.domain.book.Book;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author extends ExtendedEntity {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @OneToMany(
            mappedBy = "author",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    private Set<Book> books = new HashSet<>();

    public Author() {
    }

    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Author setBooks(Set<Book> books) {
        this.books = books;
        return this;
    }
}
