package gg.lode.observerapi.api.data;

import java.util.Map;

/**
 * An immutable snapshot of Observer's tunable settings, captured as a named preset that
 * can be saved to disk, applied back onto the server, and exported/imported between servers.
 *
 * <p>The {@code restrictions} and {@code mechanics} payloads are the full YAML text of the
 * respective config files (restrictions.yml / mechanics.yml). {@code gamerules} is a snapshot
 * of vanilla gamerule values keyed by their camelCase name.</p>
 *
 * @param id          the preset id (also its filename on disk); {@code null} for a freshly
 *                    imported preset that has not been assigned an id yet.
 * @param name        a human-friendly display name.
 * @param savedBy     the name of whoever saved the preset.
 * @param timestamp   when the preset was saved ({@code yyyy-MM-dd_HH-mm-ss}).
 * @param restrictions full YAML text of restrictions.yml (item + enchantment restrictions).
 * @param mechanics   full YAML text of mechanics.yml (game mechanics toggles).
 * @param gamerules   vanilla gamerule values keyed by camelCase name.
 */
public record SettingsPresetData(String id,
                                 String name,
                                 String savedBy,
                                 String timestamp,
                                 String restrictions,
                                 String mechanics,
                                 Map<String, Object> gamerules) {
}
