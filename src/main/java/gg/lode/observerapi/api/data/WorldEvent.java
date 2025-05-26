package gg.lode.observerapi.api.data;

import org.bukkit.Material;

public class WorldEvent {

    private Material itemIcon;
    private String id;
    private String translationId;

    public WorldEvent(Material itemIcon, String id, String translationId) {
        this.id = id;
        this.itemIcon = itemIcon;
        this.translationId = translationId;
    }

    public Material getItemIcon() {
        return itemIcon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setItemIcon(Material itemIcon) {
        this.itemIcon = itemIcon;
    }

    public String getTranslationId() {
        return translationId;
    }

    public void setTranslationId(String translationId) {
        this.translationId = translationId;
    }

}