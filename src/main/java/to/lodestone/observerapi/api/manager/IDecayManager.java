package to.lodestone.observerapi.api.manager;

import org.bukkit.Location;
import org.bukkit.World;

public interface IDecayManager {

    void markBlockForDecay(World world, int x, int y, int z);
    void markBlockForDecay(Location location);
    void unmarkBlockForDecay(World world, int x, int y, int z);
    void unmarkBlockForDecay(Location location);

}
