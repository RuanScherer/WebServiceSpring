package com.ruanscherer.course.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(final Object id) {
        super("Resource not found. Id: " + id);
    }
}
