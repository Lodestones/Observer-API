package to.lodestone.observerapi.api.error;

public class TeamOverflowException extends Exception {
    public TeamOverflowException() {
        super("There are too many teams in the game!");
    }
}
