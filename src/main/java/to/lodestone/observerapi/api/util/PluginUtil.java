package to.lodestone.observerapi.api.util;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginUtil {

    public static boolean isWorldEditInstalled(JavaPlugin plugin) {
        PluginManager pluginManager = plugin.getServer().getPluginManager();
        return pluginManager.isPluginEnabled("WorldEdit") || pluginManager.isPluginEnabled("FastAsyncWorldEdit");
    }

}
