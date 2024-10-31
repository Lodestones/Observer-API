package to.lodestone.observerapi.api.util;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import to.lodestone.bookshelfapi.api.Task;

public class EventUtil {

    public static Location scatter(Player player) {
        return scatter(player, 100, 200);
    }

    public static Location scatter(Player player, int min, int max) {
        World eventWorld = Bukkit.getWorlds().get(0);
        Location location = getSafeLocation(
                eventWorld.getSpawnLocation(),
                min,
                max
        );
        player.teleport(location);
        return location;
    }

    public static Location scatter(Player player, World world, int min, int max) {
        Location location = getSafeLocation(
                world.getSpawnLocation(),
                min,
                max
        );
        player.teleport(location);
        return location;
    }

    private static Location getSafeLocation(Location origin, double radius, double threshold) {
        World world = origin.getWorld();

        double angle = Math.random() * 2 * Math.PI;
        double distance = Math.random() * radius + threshold;
        double x = origin.getX() + distance * Math.cos(angle);
        double z = origin.getZ() + distance * Math.sin(angle);
        double y = world.getHighestBlockYAt((int) x, (int) z, HeightMap.WORLD_SURFACE);

        Location randomLocation = new Location(world, x, y, z);

        return isSafeLocation(randomLocation) ? randomLocation.add(0, 1, 0) : getSafeLocation(origin, radius, threshold);
    }

    private static boolean isSafeLocation(Location location) {
        return location.clone().subtract(0, 1, 0).getBlock().getType().isSolid() && location.getY() <= 120 && location.getY() >= 74;
    }

}
