package to.lodestone.bookshelfapi.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class ResetGameEvent extends BaseEvent implements Cancellable {

    private boolean isCancelled;
    private final Player executor;

    public ResetGameEvent(Player executor) {
        this.executor = executor;
    }

    public Player getExecutor() {
        return executor;
    }

    public void setCancelled(boolean cancelled) {
        this.isCancelled = cancelled;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

}
