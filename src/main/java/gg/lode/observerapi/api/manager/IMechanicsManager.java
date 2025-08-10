package gg.lode.observerapi.api.manager;

public interface IMechanicsManager {

    interface ICombatLoggingManager {
        enum DisplayType {
            ACTION_BAR,
            TITLE,
            CHAT
        }

        boolean canCombatLog();

        int getCombatTimer();

        DisplayType getDisplayType();

        String getDisplayMessage();

        String getCombatNotificationTranslation();
    }

    double increasedAppleRates();

    double increasedFlintRates();

    boolean isSleepingAllowed();

    boolean canEnchantItems();

    boolean canUseAnvils();

    boolean canUseEnderChests();

    boolean canBreedVillagers();

    boolean canTradeWithVillagers();

    boolean canUseRespawnAnchors();

    boolean canBedBomb();

    boolean canPortalTrap();

    boolean canIndirectPVP();

    boolean shouldGlobalBlockDecay();

    boolean isUnbreakableSpawners();

    boolean isBetterWorldBorder();

    boolean shouldMatchWorldBorders();

    boolean canBrewPotions();

    ICombatLoggingManager getCombatLoggingManager();

    boolean isNetherAllowed();

    boolean isEndAllowed();

    boolean shouldGrantAllRecipes();

    void setSleepingAllowed(boolean sleepingAllowed);

    void setEnchantItems(boolean enchantItems);

    void setUseAnvils(boolean useAnvils);

    void setUseEnderChests(boolean useEnderChests);

    void setBreedVillagers(boolean breedVillagers);

    void setTradeWithVillagers(boolean tradeWithVillagers);

    void setUseRespawnAnchors(boolean useRespawnAnchors);

    void setBedBomb(boolean bedBomb);

    void setPortalTrap(boolean portalTrap);

    void setIndirectPVP(boolean indirectPVP);

    void setGlobalBlockDecay(boolean globalBlockDecay);

    void setUnbreakableSpawners(boolean unbreakableSpawners);

    void setBetterWorldBorder(boolean betterWorldBorder);

    void setMatchWorldBorders(boolean matchWorldBorders);

    void setBrewPotions(boolean brewPotions);

    void setNetherAllowed(boolean netherAllowed);

    void setEndAllowed(boolean endAllowed);

    void setShouldGrantAllRecipes(boolean shouldGrantAllRecipes);

}
