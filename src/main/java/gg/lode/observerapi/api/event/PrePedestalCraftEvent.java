package gg.lode.observerapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class PrePedestalCraftEvent extends BaseEvent implements Cancellable {
    private final Player player;
    private final String pedestalId;
    private boolean isCancelled;

    public PrePedestalCraftEvent(Player player, String pedestalId) {
        this.player = player;
        this.pedestalId = pedestalId;
        this.isCancelled = false;
    }

    public String getPedestalId() {
        return pedestalId;
    }

    public Player getPlayer() {
        return player;
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
