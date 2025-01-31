package to.lodestone.observerapi.api.error;

public class AlreadyInLobbyModeException extends Exception {
    public AlreadyInLobbyModeException() {
        super("You are already in lobby mode!");
    }
}
