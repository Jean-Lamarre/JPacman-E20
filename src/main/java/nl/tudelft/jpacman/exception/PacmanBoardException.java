package nl.tudelft.jpacman.exception;

public class PacmanBoardException extends RuntimeException {

    private static final String DEFAULT_MESSAGE = "Board Exception occur.";

    public PacmanBoardException() {
        super(DEFAULT_MESSAGE);
    }

    public PacmanBoardException(String message) {
        super(DEFAULT_MESSAGE + "| " + message);
    }

    public PacmanBoardException(String message, Throwable cause) {
        super(DEFAULT_MESSAGE + "| " + message, cause);
    }

}
