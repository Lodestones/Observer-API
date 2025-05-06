package gg.lode.observerapi.api.exception;

public class TeamOverflowException extends Exception {
    public TeamOverflowException() {
        super("There are too many teams in the game!");
    }
}
