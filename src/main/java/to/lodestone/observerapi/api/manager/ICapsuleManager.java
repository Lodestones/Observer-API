package to.lodestone.observerapi.api.manager;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;
import to.lodestone.observerapi.api.data.Capsule;
import to.lodestone.observerapi.api.data.CapsuleType;

import java.util.List;

public interface ICapsuleManager {

    void setCapsules(List<Capsule> capsules);
    void setCapsuleLocations(List<Location> capsules);
    void setCapsuleType(CapsuleType capsuleType);
    boolean hasCapsule(Player player);
    CapsuleType getCapsuleType();
    List<Capsule> getCapsules();
    void removePlayerFromCapsule(Player player);
    void sendPlayersToCapsules(@Nullable Player executor);
    void release();


}
