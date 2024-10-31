package to.lodestone.observerapi.api.util;

import net.kyori.adventure.text.Component;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerUtil {

    public static void broadcastToPermission(JavaPlugin plugin, String permission, Component message) {
        plugin.getServer().getOnlinePlayers().stream().filter(p -> p.hasPermission(permission)).forEach(p -> p.sendMessage(message));
    }

}
