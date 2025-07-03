package gg.lode.observerapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.observerapi.api.data.Capsule;
import org.bukkit.entity.Player;

public class PlayerSwapCapsulesEvent extends BaseEvent {

    private final Player player;
    private final Player with;
    private final Capsule oldCapsule;
    private final Capsule newCapsule;

    public PlayerSwapCapsulesEvent(Player player, Player with, Capsule oldCapsule, Capsule newCapsule) {
        this.player = player;
        this.with = with;
        this.oldCapsule = oldCapsule;
        this.newCapsule = newCapsule;
    }

}
