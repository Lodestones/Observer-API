package gg.lode.observerapi.api.data.pedestals;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface IPedestalHologram {
    void despawn();

    void hide(Player player);

    void show(Player player);

    boolean isAvailableFor(Player player);

    void relocate(Location location);
}
