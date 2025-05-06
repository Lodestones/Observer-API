package gg.lode.observerapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PedestalCraftEvent extends BaseEvent {

    private final Player player;
    private final String pedestalId;
    private final Result result;
    private ItemStack itemStack;

    public PedestalCraftEvent(Player player, String pedestalId, Result result, ItemStack item) {
        this.player = player;
        this.pedestalId = pedestalId;
        this.result = result;
        this.itemStack = item;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public void setItemStack(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public Result getResult() {
        return result;
    }

    public String getPedestalId() {
        return pedestalId;
    }

    public Player getPlayer() {
        return player;
    }

    public enum Result {
        COOLDOWN,
        SUCCESS,
        MISSING_INGREDIENTS,
        MISSING_INVENTORY_SPACE,
    }

}
