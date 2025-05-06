package gg.lode.observerapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.observerapi.api.data.GameState;
import org.bukkit.entity.Player;

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
