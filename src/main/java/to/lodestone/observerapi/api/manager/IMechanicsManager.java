package to.lodestone.observerapi.api.manager;

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

}
