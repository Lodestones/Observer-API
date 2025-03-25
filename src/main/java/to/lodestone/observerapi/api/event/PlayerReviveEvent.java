package to.lodestone.observerapi.api.event;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;

public class PlayerReviveEvent extends BaseEvent implements Cancellable {
    private final Player player;
    private Location location;
    private boolean isCancelled;

    public PlayerReviveEvent(Player player, Location location) {
        this.player = player;
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
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
