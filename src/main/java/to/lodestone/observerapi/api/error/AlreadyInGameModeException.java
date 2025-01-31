package to.lodestone.observerapi.api.error;

public class AlreadyInGameModeException extends Exception {
    public AlreadyInGameModeException() {
        super("You are already in game mode!");
    }
}
