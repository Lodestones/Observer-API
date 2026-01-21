package gg.lode.observerapi.api.manager;

import gg.lode.observerapi.api.data.LifestealType;

public interface ILifestealManager {
    void setEnabled(boolean value);

    boolean isEnabled();

    void setItemName(String itemName);

    String getItemName();

    void setItemModel(String itemModel);

    String getItemModel();

    void setStackable(boolean stackable);

    boolean isStackable();

    void setLifestealType(LifestealType lifestealType);

    LifestealType getLifestealType();

    void setMaxHealth(double maxHealth);

    double getMaxHealth();

    void setMinHealth(double minHealth);

    double getMinHealth();

    void setCanWithdraw(boolean canWithdraw);

    boolean canWithdraw();

    void setShouldRemoveHeart(boolean heart);

    boolean shouldRemoveHeart();
}