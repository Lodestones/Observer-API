package to.lodestone.observerapi;

import org.bukkit.World;
import org.bukkit.entity.Player;
import to.lodestone.observerapi.api.data.GameState;
import to.lodestone.observerapi.api.manager.*;

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
     * @param player The player who triggered the event.
     * @param gameState The new game state.
     */
    void setGameState(Player player, GameState gameState);

    /**
     * This method sets the game state without triggering the PreGameStateChangeEvent.
     * @param gameState The new game state.
     */
    void setGameState(GameState gameState);
    GameState getGameState();

    double getBaseHealth();
    void setBaseHealth();

    World getLobbyWorld();
    World getEventWorld();

}
