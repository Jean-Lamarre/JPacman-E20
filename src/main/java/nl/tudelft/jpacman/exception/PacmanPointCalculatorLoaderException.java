package nl.tudelft.jpacman.exception;

public class PacmanPointCalculatorLoaderException extends RuntimeException {

    private static final String DEFAULT_MESSAGE = "PointCalculatorLoader occur.";

    public PacmanPointCalculatorLoaderException() {
        super(DEFAULT_MESSAGE);
    }

    public PacmanPointCalculatorLoaderException(String message) {
        super(DEFAULT_MESSAGE + "| " + message);
    }

    public PacmanPointCalculatorLoaderException(String message, Throwable cause) {
        super(DEFAULT_MESSAGE + "| " + message, cause);
    }

}
