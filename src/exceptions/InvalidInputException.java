package FinTrack.exceptions;

public class InvalidInputException extends Exception {
    public InvalidInputException(String output) {
        super(output);
    }
}
