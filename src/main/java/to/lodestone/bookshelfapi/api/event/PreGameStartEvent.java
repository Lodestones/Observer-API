package to.lodestone.bookshelfapi.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class PreGameStartEvent extends BaseEvent implements Cancellable {

    private boolean isCancelled;
    private final Player executor;

    public PreGameStartEvent(Player executor) {
        this.executor = executor;
    }

    public Player getExecutor() {
        return executor;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
}