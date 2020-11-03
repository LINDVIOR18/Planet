package main.java.exception;

import lombok.Getter;

@Getter
public enum HttpStatus {

    NOT_FOUND(404, "Not Found"),
    CONFLICT(409, "Conflict");

    private final int value;
    private final String reasonPhrase;

    HttpStatus(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }
    public String toString() {
        return this.value + " " + this.name();
    }
}

