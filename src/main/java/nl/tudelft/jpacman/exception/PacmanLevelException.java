package nl.tudelft.jpacman.exception;

public class PacmanLevelException extends RuntimeException {

    private static final String DEFAULT_MESSAGE = "Level Exception occur.";

    public PacmanLevelException() {
        super(DEFAULT_MESSAGE);
    }

    public PacmanLevelException(String message) {
        super(DEFAULT_MESSAGE + "| " + message);
    }

    public PacmanLevelException(String message, Throwable cause) {
        super(DEFAULT_MESSAGE + "| " + message, cause);
    }

}
