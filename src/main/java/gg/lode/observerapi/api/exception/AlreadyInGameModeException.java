package gg.lode.observerapi.api.exception;

public class AlreadyInGameModeException extends Exception {
    public AlreadyInGameModeException() {
        super("You are already in game mode!");
    }
}
