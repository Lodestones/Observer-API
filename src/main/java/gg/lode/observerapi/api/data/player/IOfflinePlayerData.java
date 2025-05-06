package gg.lode.observerapi.api.data.player;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public interface IOfflinePlayerData {

    UUID getUniqueId();

    boolean hasBeenLateScattered();

    void setHasBeenLateScattered(boolean hasBeenLateScattered);

    void setMarkedAsDead(boolean markedAsDead);

    boolean isMarkedAsDead();

    void setSittingOut(boolean sittingOut);

    boolean isSittingOut();

    String getRegion();

    void setRegion(String region);

    void load(JavaPlugin plugin, UUID uniqueId);

}
