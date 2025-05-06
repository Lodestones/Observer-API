package gg.lode.observerapi.api.manager;

import gg.lode.observerapi.api.data.Capsule;
import gg.lode.observerapi.api.data.CapsuleType;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

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

    void save();

    void swapCapsules(Player player1, Player player2);

    void reload();

    void sendPlayerToCapsule(Player player, Capsule capsule);

}
