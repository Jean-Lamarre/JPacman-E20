package nl.tudelft.jpacman.exception;

public class PacmanConfigurationLinesWidthException extends PacmanConfigurationException {

    private static final String DEFAULT_MESSAGE = "Input text lines are not of equal width.";

    public PacmanConfigurationLinesWidthException() {
        super(DEFAULT_MESSAGE);
    }

    public PacmanConfigurationLinesWidthException(String message) {
        super(DEFAULT_MESSAGE + "| " + message);
    }

    public PacmanConfigurationLinesWidthException(String message, Throwable cause) {
        super(DEFAULT_MESSAGE + "| " + message, cause);
    }

}
