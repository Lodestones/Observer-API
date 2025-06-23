package gg.lode.observerapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.jetbrains.annotations.Nullable;

public class PlayerWithdrawHeartEvent extends BaseEvent implements Cancellable {

    private final Player player;
    private boolean isCancelled;
    private double amount;
    private @Nullable Component cancellationReason;

    public PlayerWithdrawHeartEvent(Player player, double amount) {
        this.player = player;
        this.amount = amount;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        isCancelled = b;
    }

    public Player getPlayer() {
        return player;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public @Nullable Component getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(@Nullable Component cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

}
