package to.lodestone.bookshelfapi.api.event;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.jetbrains.annotations.Nullable;
import to.lodestone.bookshelfapi.api.util.MiniMessageUtil;

public class PlayerEliminatedEvent extends BaseEvent implements Cancellable {

    private final Player player;
    @Nullable
    private final LivingEntity killer;
    private boolean isCancelled;
    private Component deathMessage;
    private boolean shouldKick;
    private Component kickMessage;
    private final PlayerDeathEvent originalEvent;

    public PlayerEliminatedEvent(Player player, PlayerDeathEvent originalEvent) {
        this.player = player;
        this.originalEvent = originalEvent;
        this.killer = null;
        this.isCancelled = false;
        this.deathMessage = MiniMessageUtil.deserialize(String.format(player.getName() + " was eliminated."));
        this.shouldKick = false;
        this.kickMessage = Component.empty();
    }

    public PlayerEliminatedEvent(Player player, @Nullable LivingEntity killer, PlayerDeathEvent originalEvent) {
        this.originalEvent = originalEvent;
        this.player = player;
        this.killer = killer;
        if (killer != null)
            this.deathMessage = MiniMessageUtil.deserialize(String.format(player.getName() + " was eliminated by " + killer.getName() + "."));
        else
            this.deathMessage = MiniMessageUtil.deserialize(String.format(player.getName() + " was eliminated."));
        this.shouldKick = false;
        this.kickMessage = Component.empty();
    }

    public PlayerEliminatedEvent(Player player, @Nullable LivingEntity killer, Component deathMessage, PlayerDeathEvent originalEvent) {
        this.player = player;
        this.originalEvent = originalEvent;
        this.killer = killer;
        this.deathMessage = deathMessage;
        this.shouldKick = false;
        this.kickMessage = Component.empty();
    }

    public PlayerEliminatedEvent(Player player, @Nullable LivingEntity killer, Component deathMessage, boolean shouldKick, Component kickMessage, PlayerDeathEvent originalEvent) {
        this.player = player;
        this.originalEvent = originalEvent;
        this.killer = killer;
        this.deathMessage = deathMessage;
        this.shouldKick = shouldKick;
        this.kickMessage = kickMessage;
    }

    public Component getDeathMessage() {
        return deathMessage;
    }

    public PlayerDeathEvent getOriginalEvent() {
        return originalEvent;
    }

    public void setDeathMessage(Component deathMessage) {
        this.deathMessage = deathMessage;
    }

    public @Nullable LivingEntity getKiller() {
        return killer;
    }

    public Component getKickMessage() {
        return kickMessage;
    }

    public void setKickMessage(Component kickMessage) {
        this.kickMessage = kickMessage;
    }

    public void setShouldKick(boolean shouldKick) {
        this.shouldKick = shouldKick;
    }

    public boolean shouldKick() {
        return shouldKick;
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
