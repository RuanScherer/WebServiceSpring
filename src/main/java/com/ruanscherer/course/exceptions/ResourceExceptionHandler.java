package com.ruanscherer.course.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException exception,
                                                          HttpServletRequest request) {
        String errorTitle = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError error = new StandardError(
                Instant.now(),
                status.value(),
                errorTitle,
                exception.getMessage(),
                request.getRequestURI()
        );
        return ResponseEntity.status(status).body(error);
    }

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<StandardError> database(DatabaseException exception,
                                                          HttpServletRequest request) {
        String errorTitle = "Database error";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError error = new StandardError(
                Instant.now(),
                status.value(),
                errorTitle,
                exception.getMessage(),
                request.getRequestURI()
        );
        return ResponseEntity.status(status).body(error);
    }
}
