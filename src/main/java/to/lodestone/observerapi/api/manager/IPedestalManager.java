package to.lodestone.observerapi.api.manager;

import to.lodestone.observerapi.api.data.pedestals.PedestalConfig;

import java.util.Map;
import java.util.UUID;

public interface IPedestalManager {
    Map<String, PedestalConfig> getPedestals();

    void setPedestalUses(String id, UUID player, int uses);

    void showPedestalToPlayer(String id, UUID player);

    void hidePedestalFromPlayer(String id, UUID player);

    void register(String id, PedestalConfig recipe);

    boolean unregister(String id);

    void reload();

    void save();
}
