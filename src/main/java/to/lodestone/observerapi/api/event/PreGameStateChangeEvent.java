package to.lodestone.observerapi.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.observerapi.api.data.GameState;

import javax.annotation.Nullable;

public class PreGameStateChangeEvent extends BaseEvent implements Cancellable {

    private boolean isCancelled;
    private final GameState oldState;
    private final GameState newState;

    @Nullable
    private final Player source;
    public PreGameStateChangeEvent(GameState oldState, GameState newState, @Nullable Player source) {
        this.oldState = oldState;
        this.newState = newState;
        this.source = source;
        this.isCancelled = false;
    }

    public GameState getNewState() {
        return newState;
    }

    @Nullable
    public Player getSource() {
        return source;
    }

    public GameState getOldState() {
        return oldState;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        isCancelled = b;
    }

}
