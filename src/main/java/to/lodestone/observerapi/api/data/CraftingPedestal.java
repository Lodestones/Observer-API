package to.lodestone.observerapi.api.data;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public record CraftingPedestal(Location position,
                               List<ItemStack> ingredients,
                               ItemStack result,
                               int maxUses,
                               float itemHeight,
                               HashMap<UUID, Integer> uses) {
    public CraftingPedestal(Location position, List<ItemStack> ingredients, ItemStack result, int maxUses) {
        this(position, ingredients, result, maxUses, 1.0f, new HashMap<>());
    }

    public CraftingPedestal(Location position, List<ItemStack> ingredients, ItemStack result) {
        this(position, ingredients, result, 1, 1.0f, new HashMap<>());
    }

    public boolean isAvailableFor(Player player) {
        var used = uses.get(player.getUniqueId());
        if (used==null) return true;
        return used < maxUses;
    }
}
