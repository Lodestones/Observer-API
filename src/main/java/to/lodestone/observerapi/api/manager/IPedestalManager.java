package to.lodestone.observerapi.api.manager;

import org.jetbrains.annotations.Nullable;
import to.lodestone.observerapi.api.data.CraftingPedestal;
import to.lodestone.observerapi.api.exception.PedestalAddException;

import java.util.Map;
import java.util.UUID;

public interface IPedestalManager {
    Map<String, CraftingPedestal> pedestalsAdded();

    void showPedestalToPlayer(String id, UUID player);
    void hidePedestalFromPlayer(String id, UUID player);
    void add(String id, CraftingPedestal recipe) throws PedestalAddException;
    boolean remove(String id);

    @Nullable
    CraftingPedestal get(String id);

    void reload();
    void save();
}
