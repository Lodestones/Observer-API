package to.lodestone.observerapi.api.error;

public class InsufficientPlayersException extends Exception {
    public InsufficientPlayersException() {
        super("There are not enough players to start the game.");
    }
}
