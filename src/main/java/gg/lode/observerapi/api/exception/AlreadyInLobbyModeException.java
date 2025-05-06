package gg.lode.observerapi.api.exception;

public class AlreadyInLobbyModeException extends Exception {
    public AlreadyInLobbyModeException() {
        super("You are already in lobby mode!");
    }
}
