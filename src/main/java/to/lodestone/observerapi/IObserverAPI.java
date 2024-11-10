package to.lodestone.observerapi;

import org.bukkit.World;
import org.bukkit.entity.Player;
import to.lodestone.observerapi.api.data.GameState;
import to.lodestone.observerapi.api.manager.ICustomRecipesManager;
import to.lodestone.observerapi.api.manager.IPedestalManager;

public interface IObserverAPI {

    ICustomRecipesManager getCustomRecipesManager();
    IPedestalManager getPedestalManager();

    GameState getGameState();
    void setGameState(Player player, GameState gameState);

    World getLobbyWorld();
    World getEventWorld();

}
