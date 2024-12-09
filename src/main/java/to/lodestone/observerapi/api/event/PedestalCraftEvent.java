package to.lodestone.observerapi.api.event;

import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import to.lodestone.bookshelfapi.api.event.BaseEvent;

public class PedestalCraftEvent extends BaseEvent {

    public enum Result {
        COOLDOWN,
        SUCCESS,
        MISSING_INGREDIENTS,
        MISSING_INVENTORY_SPACE,
    }

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

    public void setItemStack(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public ItemStack getItemStack() {
        return itemStack;
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

}
