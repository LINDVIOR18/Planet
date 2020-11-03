package main.java.exception;

public class DocumentAlreadyExist extends PlanetException {
    private static final long serialVersionUID = -2778634536400014438L;

    DocumentAlreadyExist(String message) {
        super(message, HttpStatus.CONFLICT);
    }
}
