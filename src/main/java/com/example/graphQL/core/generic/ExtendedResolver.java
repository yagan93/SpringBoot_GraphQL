package com.example.graphQL.core.generic;

import java.util.NoSuchElementException;
import java.util.Optional;

public abstract class ExtendedResolver<T extends ExtendedEntity> {

    protected T findOrThrow(Optional<T> optional) throws NoSuchElementException {
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

}
