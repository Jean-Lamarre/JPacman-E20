package nl.tudelft.jpacman.exception;

public class PacmanConfigurationEmptyException extends PacmanConfigurationException {

    private static final String DEFAULT_MESSAGE = "Input text must consist of at least 1 row.";

    public PacmanConfigurationEmptyException() {
        super(DEFAULT_MESSAGE);
    }

    public PacmanConfigurationEmptyException(String message) {
        super(DEFAULT_MESSAGE + "| " + message);
    }

    public PacmanConfigurationEmptyException(String message,Throwable cause) {
        super(DEFAULT_MESSAGE + "| " + message, cause);
    }

}
