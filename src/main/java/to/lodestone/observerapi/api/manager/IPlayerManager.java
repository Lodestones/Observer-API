package to.lodestone.observerapi.api.manager;

import org.bukkit.entity.Player;
import to.lodestone.observerapi.api.data.player.IOfflinePlayerData;
import to.lodestone.observerapi.api.data.player.IPlayerData;

import java.util.UUID;

public interface IPlayerManager {

    IPlayerData getPlayerData(Player player);
    IOfflinePlayerData getPlayerData(UUID uniqueId);

    void save(IPlayerData playerData);
    void save();

}
