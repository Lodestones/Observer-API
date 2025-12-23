package gg.lode.observerapi.api.data.pedestals;

import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface IPedestalHologram {
    void despawn();

    void hide(Player player);

    void show(Player player);

    boolean isAvailableFor(Player player);

    void relocate(Location location);

    /**
     * Sets custom lines at the specified position.
     *
     * @param position The position to place the lines (BEFORE_TITLE, AFTER_TITLE, or AFTER_INGREDIENTS)
     * @param lines    The custom lines to insert, or null/empty to clear lines at that position
     */
    void setCustomLines(@NotNull CustomLinePosition position, @Nullable List<Component> lines);

    /**
     * Gets the custom lines at the specified position.
     *
     * @param position The position to get lines from
     * @return The custom lines at that position, or null if none are set
     */
    @Nullable
    List<Component> getCustomLines(@NotNull CustomLinePosition position);

    /**
     * Adds a custom line at the specified position.
     *
     * @param position The position to add the line to
     * @param line     The line to add
     */
    void addCustomLine(@NotNull CustomLinePosition position, @NotNull Component line);

    /**
     * Clears all custom lines at the specified position.
     *
     * @param position The position to clear
     */
    void clearCustomLines(@NotNull CustomLinePosition position);

    /**
     * Clears all custom lines at all positions, reverting to default display (title and ingredients only).
     */
    void clearAllCustomLines();

    /**
     * Updates the text display with the current text.
     * This is automatically called when setting custom lines, but can be called manually if needed.
     */
    void updateTextDisplay();

    /**
     * Position where custom lines can be inserted in the hologram display.
     */
    enum CustomLinePosition {
        /**
         * Before the title
         */
        BEFORE_TITLE,
        /**
         * After the title, before ingredients
         */
        AFTER_TITLE,
        /**
         * After the ingredients
         */
        AFTER_INGREDIENTS
    }
}
