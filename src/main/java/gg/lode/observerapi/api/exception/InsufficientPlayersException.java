package gg.lode.observerapi.api.exception;

public class InsufficientPlayersException extends Exception {
    public InsufficientPlayersException() {
        super("There are not enough players to start the game.");
    }
}
