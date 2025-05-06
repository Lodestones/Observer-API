package gg.lode.observerapi.api.data;

import org.bukkit.Location;

import java.util.List;

public record RespawnData(
        String timestamp,
        byte[] contents,
        double health,
        int foodLevel,
        float saturation,
        float experience,
        int level,
        double absorption,
        int fireTicks,
        List<String> potionEffects,
        Location location
) {
}
