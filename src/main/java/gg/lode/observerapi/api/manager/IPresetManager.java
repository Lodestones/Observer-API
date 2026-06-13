package gg.lode.observerapi.api.manager;

import gg.lode.observerapi.api.data.SettingsPresetData;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Manages settings presets: named snapshots of Observer's item restrictions, enchantment
 * limits, game mechanics, and vanilla gamerules. Presets can be saved to disk, re-applied,
 * deleted, and exported/imported as shareable strings (uploaded to a paste service when long).
 */
public interface IPresetManager {

    /**
     * @return the ids of every preset currently saved on disk.
     */
    List<String> getPresetIds();

    /**
     * @return whether a preset with the given id exists on disk.
     */
    boolean presetExists(String id);

    /**
     * Loads a preset from disk.
     *
     * @return the preset, or {@code null} if no preset with that id exists.
     */
    SettingsPresetData getPreset(String id);

    /**
     * @return every preset currently saved on disk.
     */
    List<SettingsPresetData> getPresets();

    /**
     * Captures the server's current settings as a preset and writes it to disk.
     *
     * @param player the player saving the preset (recorded as the author).
     * @param id     the preset id (also its filename).
     * @param name   a human-friendly display name.
     */
    void savePreset(Player player, String id, String name);

    /**
     * Applies a saved preset, replacing the server's current item restrictions, enchantment
     * limits, game mechanics, and gamerules with the preset's captured values.
     *
     * @return true if the preset existed and was applied.
     */
    boolean applyPreset(String id);

    /**
     * Deletes a preset from disk.
     *
     * @return true if a preset with that id existed and was deleted.
     */
    boolean deletePreset(String id);

    /**
     * Serializes a preset into a shareable form. Short presets are returned inline; long ones
     * are uploaded to a paste service and the result references the upload.
     */
    CompletableFuture<ExportResult> exportPreset(String id);

    /**
     * Deserializes a preset from an exported string or paste reference, without saving it.
     */
    CompletableFuture<SettingsPresetData> importPreset(String input);

    /**
     * Imports a preset from an exported string or paste reference and saves it under the given id.
     */
    CompletableFuture<Void> importAndSave(String input, String id);

    /**
     * The result of {@link #exportPreset(String)}.
     *
     * @param value   the inline serialized string, or the paste id when {@code isPaste} is true.
     * @param isPaste whether the preset was uploaded to a paste service.
     * @param url     the share url when uploaded, otherwise {@code null}.
     */
    record ExportResult(String value, boolean isPaste, String url) {
        /**
         * @return the value to show to a user: a share url for uploads, or the inline string.
         */
        public String getDisplayValue() {
            if (isPaste) {
                return url != null ? url : "mclo.gs/" + value;
            }
            return value;
        }
    }
}
