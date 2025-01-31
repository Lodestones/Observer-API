package to.lodestone.observerapi.api.error;

public class InsufficientTeamsException extends Exception {
    public InsufficientTeamsException() {
        super("There are not enough teams to start the game.");
    }
}
