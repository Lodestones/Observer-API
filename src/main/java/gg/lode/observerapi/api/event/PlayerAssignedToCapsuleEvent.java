package gg.lode.observerapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.observerapi.api.data.Capsule;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class PlayerAssignedToCapsuleEvent extends BaseEvent {

    private final Player player;
    private final Capsule capsule;
    private final Location location;

    public PlayerAssignedToCapsuleEvent(Player player, Capsule capsule) {
        this.player = player;
        this.capsule = capsule;
        this.location = capsule.location();
    }

    public Player getPlayer() {
        return player;
    }

    public Location getLocation() {
        return location;
    }

    public Capsule getCapsule() {
        return capsule;
    }

}
