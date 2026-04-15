package com.example.demo.exception;

import org.springframework.http.HttpStatus;

public class ApiException extends RuntimeException {
    private final HttpStatus status;
    private final String timestamp;

    public ApiException(String message, HttpStatus status) {
        super(message);
        this.status = status;
        this.timestamp = new java.time.ZonedDateTime.now().toString();
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
