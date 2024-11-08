package to.lodestone.observerapi.api.event;

import org.bukkit.entity.Player;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.observerapi.api.data.GameState;

import javax.annotation.Nullable;

public class GameStateChangeEvent extends BaseEvent {

    private final GameState oldState;
    private final GameState newState;

    @Nullable
    private final Player source;

    public GameStateChangeEvent(GameState oldState, GameState newState, @Nullable Player source) {
        this.oldState = oldState;
        this.newState = newState;
        this.source = source;
    }

    @Nullable
    public Player getSource() {
        return source;
    }

    public GameState getOldState() {
        return oldState;
    }

    public GameState getNewState() {
        return newState;
    }
}
