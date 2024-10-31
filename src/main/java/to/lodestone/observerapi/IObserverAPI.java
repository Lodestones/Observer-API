package to.lodestone.observerapi;

import org.bukkit.World;
import org.bukkit.entity.Player;
import to.lodestone.observerapi.api.data.GameState;

public interface IObserverAPI {

    GameState getGameState();
    void setGameState(Player player, GameState gameState);

    World getLobbyWorld();
    World getEventWorld();

}
