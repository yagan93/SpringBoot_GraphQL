package com.example.graphQL.domain.author.input;

public class AuthorCreateInput {
    private String firstName;
    private String lastName;

    public AuthorCreateInput() {
    }

    public AuthorCreateInput(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}
