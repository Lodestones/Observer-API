package gg.lode.observerapi.api.manager;

import gg.lode.observerapi.api.data.RespawnData;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.List;

public interface IKitManager {

    /**
     * Saves a player's current state as a kit.
     *
     * @param player       The player whose state to save
     * @param kitId        The unique ID for the kit
     * @param saveLocation Whether to save the player's location
     * @throws IOException If the kit could not be saved
     */
    void savePlayerState(Player player, String kitId, boolean saveLocation) throws IOException;

    /**
     * Loads a kit onto a player.
     *
     * @param player    The player to load the kit onto
     * @param stateData The kit data to load
     */
    void loadPlayerState(Player player, RespawnData stateData);

    /**
     * Deletes a kit by its ID.
     *
     * @param kitId The kit ID to delete
     * @return true if the kit was deleted, false if it didn't exist
     */
    boolean deleteKit(String kitId);

    /**
     * Renames a kit.
     *
     * @param kitId   The kit ID
     * @param newName The new display name for the kit
     * @return true if the kit was renamed, false if it didn't exist
     */
    boolean renameKit(String kitId, String newName);

    /**
     * Gets a kit by its unique ID.
     *
     * @param kitId The kit ID
     * @return The kit data, or null if not found
     */
    @Nullable
    RespawnData getKitById(String kitId);

    /**
     * Gets all kit IDs.
     *
     * @return A list of all kit IDs
     */
    List<String> getKitIds();

    /**
     * Checks if a kit with the given ID exists.
     *
     * @param kitId The kit ID to check
     * @return true if the kit exists
     */
    boolean kitExists(String kitId);

    /**
     * Gets all kits.
     *
     * @return A list of all kit data
     */
    List<RespawnData> getKits();
}
