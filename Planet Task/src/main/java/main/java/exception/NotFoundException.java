package main.java.exception;

public class NotFoundException extends PlanetException {
    private static final long serialVersionUID = 2103996064364627922L;

    NotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}

