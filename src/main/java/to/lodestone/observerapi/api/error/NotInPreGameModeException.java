package to.lodestone.observerapi.api.error;

public class NotInPreGameModeException extends Exception {
    public NotInPreGameModeException() {
        super("You are not in pre-game mode!");
    }
}
