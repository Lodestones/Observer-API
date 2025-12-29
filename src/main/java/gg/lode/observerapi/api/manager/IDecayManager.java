package gg.lode.observerapi.api.manager;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;

public interface IDecayManager {

    void markBlockForDecay(World world, int x, int y, int z);

    void markBlockForDecay(Location location);

    void markBlockForDecay(Block block);

    /**
     * In ticks, decay a blame within a specific time.
     *
     * @param block     What block to decay
     * @param decayTime How long to decy (in ticks)
     */
    void markBlockForDecay(Block block, int decayTime);

    void markBlockForDecay(World world, int x, int y, int z, int decayTime);

    void markBlockForDecay(Location location, int decayTime);

    void unmarkBlockForDecay(World world, int x, int y, int z);

    void unmarkBlockForDecay(Location location);

    void unmarkBlockForDecay(Block block);

    boolean isMarkedForDecay(World world, int x, int y, int z);

    boolean isMarkedForDecay(Location location);

}
