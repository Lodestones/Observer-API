package gg.lode.observerapi;

import gg.lode.observerapi.api.data.GameState;
import gg.lode.observerapi.api.manager.*;
import org.bukkit.World;
import org.bukkit.entity.Player;

public interface IObserverAPI {

    ICapsuleManager getCapsuleManager();

    ICustomRecipesManager getCustomRecipesManager();

    IDecayManager getDecayManager();

    IEliminationManager getEliminationManager();

    ILateScatterManager getLateScatterManager();

    ILifestealManager getLifestealManager();

    IMechanicsManager getMechanicsManager();

    IPedestalManager getPedestalManager();

    IPlayerManager getPlayerManager();

    IRespawnManager getRespawnManager();

    ITranslationManager getTranslationManager();

    /**
     * This method triggers the PreGameStateChangeEvent with the player who triggered it.
     *
     * @param player    The player who triggered the event.
     * @param gameState The new game state.
     */
    void setGameState(Player player, GameState gameState);

    /**
     * This method sets the game state without triggering the PreGameStateChangeEvent.
     *
     * @param gameState The new game state.
     */
    void setGameState(GameState gameState);

    GameState getGameState();

    double getBaseHealth();

    void setBaseHealth(double baseHealth);

    World getLobbyWorld();

    World getEventWorld();

}
