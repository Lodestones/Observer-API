package gg.lode.observerapi.api.manager;

import org.bukkit.GameMode;

public interface IEliminationManager {
    boolean isEnabled();

    void setEnabled(boolean enabled);

    String getDeathMessage();

    void setDeathMessage(String deathMessage);

    String getKickMessage();

    void setKickMessage(String kickMessage);

    boolean isAutoBanEnabled();

    void setAutoBanEnabled(boolean autoKickEnabled);

    String getAutoBanBypass();

    void setAutoBanBypass(String autoKickBypass);

    boolean shouldLightningOnKill();

    void setLightningOnKill(boolean lightningOnKill);

    GameMode getGamemodeOnDeath();

    void setGamemodeOnDeath(GameMode gamemode);

    boolean isAutoRespawn();

    void setAutoRespawn(boolean autoRespawn);
}