package gg.lode.observerapi.api.exception;

public class AlreadyInPreGameModeException extends Exception {
    public AlreadyInPreGameModeException() {
        super("You are already in pre-game mode!");
    }
}
