package com.ruanscherer.course.exceptions;

public class DatabaseException extends RuntimeException {

    public DatabaseException(final String message) {
        super((message));
    }
}
