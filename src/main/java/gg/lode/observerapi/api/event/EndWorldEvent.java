package gg.lode.observerapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.observerapi.api.data.WorldEvent;
import org.bukkit.event.Cancellable;

public class EndWorldEvent extends BaseEvent implements Cancellable {

    private boolean cancelled = false;
    private final WorldEvent worldEvent;

    public EndWorldEvent(WorldEvent worldEvent) {
        this.worldEvent = worldEvent;
    }

    public WorldEvent getWorldEvent() {
        return worldEvent;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        cancelled = b;
    }
}
