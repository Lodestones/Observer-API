package to.lodestone.observerapi.api.error;

public class AlreadyInPreGameModeException extends Exception {
    public AlreadyInPreGameModeException() {
        super("You are already in pre-game mode!");
    }
}
