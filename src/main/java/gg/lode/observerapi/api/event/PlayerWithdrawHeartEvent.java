package gg.lode.observerapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

public class PlayerWithdrawHeartEvent extends BaseEvent implements Cancellable {

    private final Player player;
    private boolean isCancelled;
    private double withdrawAmount;
    private @Nullable Component cancellationReason;
    private ItemStack heartStack;

    public PlayerWithdrawHeartEvent(Player player, ItemStack heartStack, double withdrawAmount) {
        this.player = player;
        this.heartStack = heartStack;
        this.withdrawAmount = withdrawAmount;
    }

    public void setHeartStack(ItemStack heartStack) {
        this.heartStack = heartStack;
    }

    public ItemStack getHeartStack() {
        return heartStack;
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

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public @Nullable Component getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(@Nullable Component cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

}
