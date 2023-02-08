package nl.tudelft.jpacman.exception;

public class PacmanConfigurationNullException extends PacmanConfigurationException{

    private static final String DEFAULT_MESSAGE = "Input text cannot be null.";

    public PacmanConfigurationNullException() {
        super(DEFAULT_MESSAGE);
    }

    public PacmanConfigurationNullException(String message) {
        super(DEFAULT_MESSAGE + "| " + message);
    }


    public PacmanConfigurationNullException(String message,Throwable cause) {
        super(DEFAULT_MESSAGE + "| " + message, cause);
    }
}
