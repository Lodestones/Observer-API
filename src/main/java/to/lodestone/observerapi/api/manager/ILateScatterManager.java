package to.lodestone.observerapi.api.manager;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public interface ILateScatterManager {
    boolean isEnabled();

    void setEnabled(boolean value);

    GameMode getGamemode();

    void setGamemode(GameMode gamemode);

    ItemStack[] getItems();

    void setItems(ItemStack[] contents);
    void setTranslation(String translation);
    String getTranslation();
}