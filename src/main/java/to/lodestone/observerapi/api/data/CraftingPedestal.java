package to.lodestone.observerapi.api.data;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public record CraftingPedestal(String id,
                               Location position,
                               List<ItemStack> ingredients,
                               ItemStack result,
                               int maxUses,
                               float itemHeight,
                               PedestalType pedestalType,
                               HashMap<UUID, Integer> uses) {
    public CraftingPedestal(String id, Location position, List<ItemStack> ingredients, ItemStack result, int maxUses, PedestalType pedestalType) {
        this(id, position, ingredients, result, maxUses, 1.0f, pedestalType, new HashMap<>());
    }

    public CraftingPedestal(String id, Location position, List<ItemStack> ingredients, ItemStack result, PedestalType pedestalType) {
        this(id, position, ingredients, result, 1, 1.0f, pedestalType, new HashMap<>());
    }

    public boolean isAvailableFor(Player player) {
        var used = uses.get(player.getUniqueId());
        if (used == null) return true;
        return used < maxUses;
    }
}
