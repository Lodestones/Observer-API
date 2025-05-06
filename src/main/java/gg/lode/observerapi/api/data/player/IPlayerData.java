package gg.lode.observerapi.api.data.player;

import org.jetbrains.annotations.Nullable;

public interface IPlayerData extends IOfflinePlayerData {

    boolean inCombat();

    void setCombat(boolean inCombat);

    boolean isInLobbyMode();

    void setInLobbyMode(boolean inLobbyMode);

    boolean isDead();

    boolean isStaffing();

    @Nullable
    String getBindedTeam();

    void setBindedTeam(@Nullable String team);

}
