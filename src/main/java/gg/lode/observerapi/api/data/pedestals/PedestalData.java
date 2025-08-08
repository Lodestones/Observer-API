package gg.lode.observerapi.api.data.pedestals;

import gg.lode.observerapi.api.data.PedestalType;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public record PedestalData(String id,
                           Location position,
                           List<ItemStack> ingredients,
                           ItemStack result,
                           int maxUses,
                           float itemHeight,
                           PedestalType pedestalType,
                           HashMap<UUID, Integer> uses) {
    public boolean isAvailableFor(Player player) {
        var used = uses.get(player.getUniqueId());
        if (used == null) return true;
        return used < maxUses;
    }

    public static PedestalData of(String id,
                                  Location position,
                                  List<ItemStack> ingredients,
                                  ItemStack result,
                                  int maxUses,
                                  PedestalType pedestalType) {
        return new PedestalData(id, position, ingredients, result, maxUses, 1.0f, pedestalType, new HashMap<>());
    }

    public PedestalData relocate(Location location) {
        return new PedestalData(id, location, ingredients, result, maxUses, itemHeight, pedestalType, uses);
    }
}
