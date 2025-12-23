package gg.lode.observerapi.api.manager;

public interface IHelpOpManager {

    boolean isEnabled();

    void setEnabled(boolean enabled);

    long getCooldown();

    void setCooldown(long milliseconds);

    void clearHelpOps();

}
