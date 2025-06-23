package gg.lode.observerapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import org.bukkit.entity.Player;

public class PlayerJoinFirstTimeEvent extends BaseEvent {

    private final Player player;

    public PlayerJoinFirstTimeEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
