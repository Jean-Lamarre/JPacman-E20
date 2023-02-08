package nl.tudelft.jpacman.exception;

public class PacmanConfigurationEmptyLinesException extends PacmanConfigurationException {

    private static final String DEFAULT_MESSAGE = "Input text lines cannot be empty.";

    public PacmanConfigurationEmptyLinesException() {
        super(DEFAULT_MESSAGE);
    }

    public PacmanConfigurationEmptyLinesException(String message) {
        super(DEFAULT_MESSAGE + "| " + message);
    }

    public PacmanConfigurationEmptyLinesException(String message, Throwable cause) {
        super(DEFAULT_MESSAGE + "| " + message, cause);
    }

}
