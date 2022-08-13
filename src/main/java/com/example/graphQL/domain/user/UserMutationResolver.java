package com.example.graphQL.domain.user;

import com.example.graphQL.core.generic.ExtendedResolver;
import com.example.graphQL.domain.user.input.UserCreateInput;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMutationResolver extends ExtendedResolver<User> implements GraphQLMutationResolver {

    private UserRepository userRepository;

    @Autowired
    public UserMutationResolver(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(UserCreateInput userCreateInput) {
        User user = userRepository.save(new User(userCreateInput.getFirstName(), userCreateInput.getLastName()));
        return findOrThrow(userRepository.findById(user.getId()));
    }
}