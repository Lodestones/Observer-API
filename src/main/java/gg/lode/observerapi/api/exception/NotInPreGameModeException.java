package gg.lode.observerapi.api.exception;

public class NotInPreGameModeException extends Exception {
    public NotInPreGameModeException() {
        super("You are not in pre-game mode!");
    }
}
