package main;

public class IncorrectFileNameException extends RuntimeException {
    public IncorrectFileNameException() {
        super();
    }

    public IncorrectFileNameException(String message) {
        super(message);
    }
}
