package to.lodestone.observerapi.api.manager;

import org.bukkit.entity.Player;
import to.lodestone.observerapi.api.data.RespawnData;

import java.util.UUID;

public interface IRespawnManager {

    void respawnPlayer(Player player, RespawnData respawnData);
    boolean isEnabled();
    void setEnabled(boolean enabled);

}
