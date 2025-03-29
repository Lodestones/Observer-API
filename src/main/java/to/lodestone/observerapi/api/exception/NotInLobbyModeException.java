package to.lodestone.observerapi.api.exception;

public class NotInLobbyModeException extends Exception {
    public NotInLobbyModeException() {
        super("You are not in lobby mode!");
    }
}
