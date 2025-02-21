package to.lodestone.observerapi.api.manager;

import org.bukkit.GameMode;
import org.bukkit.Material;
import to.lodestone.observerapi.api.data.GameState;

import java.util.Map;

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
        void setGamemodeOnDeath(GameMode gamemode);
        GameMode getGamemodeOnDeath();
        void setAutoRespawn(boolean autoRespawn);
        boolean isAutoRespawn();
    }

    interface IGameConfig {
        void setBaseHealth(double baseHealth);
        double getBaseHealth();
        boolean isNetherOpen();
        boolean isEndOpen();
        void setNetherOpen(boolean isNetherOpen);
        void setEndOpen(boolean isEndOpen);
        GameState getGameState();
        void setSleepingAllowed(boolean sleepingAllowed);
        boolean isSleepingAllowed();
        void setCanEnchantItems(boolean enchantableItemsAllowed);
        boolean canEnchantItems();
        void setAllowVillagerTrading(boolean allowVillagerTrading);
        boolean isVillagerTradingAllowed();
        void setAllowVillagerBreeding(boolean allowVillagerBreeding);
        boolean isVillagerBreedingAllowed();
        void setRespawnAnchorAllowed(boolean respawnAnchorAllowed);
        boolean isRespawnAnchorAllowed();
        void setBedBombingAllowed(boolean bedBombingAllowed);
        boolean isBedBombingAllowed();
        void setPortalTrapAllowed(boolean portalTrapAllowed);
        boolean isPortalTrapAllowed();
        void setIPVPAllowed(boolean iPVPAllowed);
        boolean isIPVPAllowed();
        void setGlobalBlockDecay(boolean globalBlockDecayAllowed);
        boolean isGlobalBlockDecay();
        void setUnbreakableSpawnerAllowed(boolean unbreakableSpawnerAllowed);
        boolean isUnbreakableSpawnerAllowed();
        void setBetterWorldBorder(boolean betterWorldBorder);
        boolean isBetterWorldBorder();
        void setCanPotionsBeBrewed(boolean canPotionsBeBrewed);
        boolean canPotionsBeBrewed();
        void setCombatLoggingAllowed(boolean combatLoggingAllowed);
        boolean isCombatLoggingAllowed();
        void setIncreasedAppleRates(boolean increasedAppleRates);
        boolean isIncreasedAppleRates();

        /**
         * Set the game state without triggering the event.
         */
        void setGameState(GameState gameState);
        IEliminationConfig getEliminationConfig();
    }

    IGameConfig getGameConfig();
    ILateJoinManager getLateJoinManager();

    interface ILateJoinManager {
        void setEnabled(boolean value);

        boolean isEnabled();

        void setGamemode(GameMode gamemode);

        GameMode getGamemode();

        void setItems(Map<Material, Integer> items);

        Map<Material, Integer> getItems();
    }
}
