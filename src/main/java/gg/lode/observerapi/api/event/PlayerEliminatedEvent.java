package gg.lode.observerapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.bookshelfapi.api.util.MiniMessageHelper;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerEliminatedEvent extends BaseEvent implements Cancellable {

    private final Player player;
    @Nullable
    private final LivingEntity killer;
    private boolean isCancelled;
    private Component deathMessage;
    private final PlayerDeathEvent originalEvent;
    private boolean hasBeenModified = false;
    private List<ItemStack> drops;

    public PlayerEliminatedEvent(Player player, PlayerDeathEvent originalEvent) {
        this.player = player;
        this.originalEvent = originalEvent;
        this.killer = null;
        this.isCancelled = false;
        this.deathMessage = MiniMessageHelper.deserialize(String.format(player.getName() + " was eliminated."));
        this.drops = new ArrayList<>();
        this.drops.addAll(Arrays.stream(player.getInventory().getContents()).toList());
    }

    public PlayerEliminatedEvent(Player player, @Nullable LivingEntity killer, PlayerDeathEvent originalEvent) {
        this.originalEvent = originalEvent;
        this.player = player;
        this.killer = killer;
        if (killer != null)
            this.deathMessage = MiniMessageHelper.deserialize(String.format(player.getName() + " was eliminated by " + killer.getName() + "."));
        else
            this.deathMessage = MiniMessageHelper.deserialize(String.format(player.getName() + " was eliminated."));
        this.drops = new ArrayList<>();
        this.drops.addAll(Arrays.stream(player.getInventory().getContents()).toList());
    }

    public PlayerEliminatedEvent(Player player, @Nullable LivingEntity killer, Component deathMessage, PlayerDeathEvent originalEvent) {
        this.player = player;
        this.originalEvent = originalEvent;
        this.killer = killer;
        this.deathMessage = deathMessage;
        this.drops = new ArrayList<>();
        this.drops.addAll(Arrays.stream(player.getInventory().getContents()).toList());
    }

    public void setHasBeenModified(boolean hasBeenModified) {
        this.hasBeenModified = hasBeenModified;
    }

    public boolean hasBeenModified() {
        return hasBeenModified;
    }

    public Component getDeathMessage() {
        return deathMessage;
    }

    public PlayerDeathEvent getOriginalEvent() {
        return originalEvent;
    }

    public List<ItemStack> getDrops() {
        return drops;
    }

    public void setDrops(List<ItemStack> drops) {
        this.drops = drops;
    }

    public void setDeathMessage(Component deathMessage) {
        this.deathMessage = deathMessage;
        this.hasBeenModified = true;
    }

    public @Nullable LivingEntity getKiller() {
        return killer;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
}
