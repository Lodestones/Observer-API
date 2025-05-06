package gg.lode.observerapi.api.exception;

public class InsufficientTeamsException extends Exception {
    public InsufficientTeamsException() {
        super("There are not enough teams to start the game.");
    }
}
