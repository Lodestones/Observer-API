package gg.lode.observerapi.api.exception;

public class PlayerOverflowException extends Exception {
    public PlayerOverflowException() {
        super("There are too many players in the game!");
    }
}
