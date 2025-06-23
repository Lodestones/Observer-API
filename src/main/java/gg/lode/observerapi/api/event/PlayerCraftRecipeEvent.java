package gg.lode.observerapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.inventory.ItemStack;

public class PlayerCraftRecipeEvent extends BaseEvent implements Cancellable {

    private final Player player;
    private final String recipeId;
    private final ItemStack itemStack;
    private final int amount;
    private boolean isCancelled;

    public PlayerCraftRecipeEvent(Player player, String recipeId, ItemStack itemStack, int amount) {
        this.player = player;
        this.recipeId = recipeId;
        this.itemStack = itemStack;
        this.amount = amount;
    }

    public Player getPlayer() {
        return player;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public int getAmount() {
        return amount;
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
