package gg.lode.observerapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

import javax.annotation.Nullable;

public class PlayerConsumeHeartEvent extends BaseEvent implements Cancellable {

    private final Player player;
    private boolean isCancelled;
    private @Nullable Component cancellationMessage;

    public PlayerConsumeHeartEvent(Player player) {
        this.player = player;
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

    @Nullable
    public Component cancellationMessage() {
        return cancellationMessage;
    }

    public void cancellationMessage(@Nullable Component cancellationMessage) {
        this.cancellationMessage = cancellationMessage;
    }
}
