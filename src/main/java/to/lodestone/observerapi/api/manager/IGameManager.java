package to.lodestone.observerapi.api.manager;

import to.lodestone.observerapi.api.data.GameState;

public interface IGameManager {

    interface IEliminationConfig {
        boolean isEnabled();
        void setEnabled(boolean enabled);
        String getDeathMessage();
        String getKickMessage();
        void setDeathMessage(String deathMessage);
        void setKickMessage(String kickMessage);
        boolean isAutoKickEnabled();
        void setAutoKickEnabled(boolean autoKickEnabled);
        String getAutoKickBypass();
        void setAutoKickBypass(String autoKickBypass);
        boolean shouldLightningOnKill();
        void setLightningOnKill(boolean lightningOnKill);
    }

    interface IGameConfig {
        boolean isNetherOpen();
        boolean isEndOpen();
        void setNetherOpen(boolean isNetherOpen);
        void setEndOpen(boolean isEndOpen);
        GameState getGameState();
        void setGameState(GameState gameState);



        IEliminationConfig getEliminationConfig();
    }

    IGameConfig getGameConfig();

}
