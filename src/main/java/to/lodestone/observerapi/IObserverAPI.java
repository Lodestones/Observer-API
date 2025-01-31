package to.lodestone.observerapi;

import org.bukkit.World;
import org.bukkit.entity.Player;
import to.lodestone.observerapi.api.data.GameState;
import to.lodestone.observerapi.api.manager.*;

public interface IObserverAPI {

    ICustomRecipesManager getCustomRecipesManager();
    IPedestalManager getPedestalManager();
    IDecayManager getDecayManager();
    IGameManager getGameManager();
    IPlayerManager getPlayerManager();
    ITranslationManager getTranslationManager();
    ICapsuleManager getCapsuleManager();
    IGameManager.ILateJoinManager getLateJoinManager();
    ILifestealManager getEliminatedManager();
    IRespawnManager getRespawnManager();

    void setGameState(Player player, GameState gameState);

    World getLobbyWorld();
    World getEventWorld();

}
