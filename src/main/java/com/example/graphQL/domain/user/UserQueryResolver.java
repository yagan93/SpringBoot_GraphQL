package com.example.graphQL.domain.user;

import com.example.graphQL.core.generic.ExtendedResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class UserQueryResolver extends ExtendedResolver<User> implements GraphQLQueryResolver {

    private UserRepository userRepository;

    @Autowired
    public UserQueryResolver(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findUserById(String id) {
        return findOrThrow(userRepository.findById(UUID.fromString(id)));
    }
}
