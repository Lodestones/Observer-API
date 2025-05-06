package gg.lode.observerapi.api.exception;

public class NotInLobbyModeException extends Exception {
    public NotInLobbyModeException() {
        super("You are not in lobby mode!");
    }
}
