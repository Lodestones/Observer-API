package gg.lode.observerapi.api.manager;

import gg.lode.observerapi.api.data.player.IOfflinePlayerData;
import gg.lode.observerapi.api.data.player.IPlayerData;
import org.bukkit.entity.Player;

import java.util.UUID;

public interface IPlayerManager {

    IPlayerData getPlayerData(Player player);

    IOfflinePlayerData getPlayerData(UUID uniqueId);

    void save(IPlayerData playerData);

    void save();

}
