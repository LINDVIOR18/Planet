package main.java.exception;

import lombok.Getter;

@Getter
public class PlanetException extends RuntimeException {

    private final String message;

    private final HttpStatus httpStatus;

    PlanetException(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
