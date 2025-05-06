package gg.lode.observerapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.observerapi.api.data.GameState;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

import javax.annotation.Nullable;

public class PreGameStateChangeEvent extends BaseEvent implements Cancellable {

    private boolean isCancelled;
    private final GameState oldState;
    private final GameState newState;
    private int tickDelay;

    @Nullable
    private final Player source;

    public PreGameStateChangeEvent(GameState oldState, GameState newState, @Nullable Player source, int tickDelay) {
        this.oldState = oldState;
        this.tickDelay = tickDelay;
        this.newState = newState;
        this.source = source;
        this.isCancelled = false;
    }

    public PreGameStateChangeEvent(GameState oldState, GameState newState, @Nullable Player source) {
        this(oldState, newState, source, 0);
    }

    public void setTickDelay(int tickDelay) {
        this.tickDelay = tickDelay;
    }

    public int getTickDelay() {
        return tickDelay;
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
