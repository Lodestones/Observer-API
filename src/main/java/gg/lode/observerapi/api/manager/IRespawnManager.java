package gg.lode.observerapi.api.manager;

import gg.lode.observerapi.api.data.RespawnData;
import org.bukkit.entity.Player;

public interface IRespawnManager {

    void createRespawnData(Player player);

    void respawnPlayer(Player player, RespawnData respawnData);

    boolean isEnabled();

    void setEnabled(boolean enabled);

}
