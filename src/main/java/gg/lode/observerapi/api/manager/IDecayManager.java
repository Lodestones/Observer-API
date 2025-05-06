package gg.lode.observerapi.api.manager;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;

public interface IDecayManager {

    void markBlockForDecay(World world, int x, int y, int z);

    void markBlockForDecay(Location location);

    void markBlockForDecay(Block block);

    void unmarkBlockForDecay(World world, int x, int y, int z);

    void unmarkBlockForDecay(Location location);

    void unmarkBlockForDecay(Block block);

    boolean isMarkedForDecay(World world, int x, int y, int z);

    boolean isMarkedForDecay(Location location);

}
