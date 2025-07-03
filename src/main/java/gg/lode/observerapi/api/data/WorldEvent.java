package gg.lode.observerapi.api.data;

import org.bukkit.Material;

import java.util.List;

public class WorldEvent {

    private Material itemIcon;
    private String id;
    private String translationId;
    private List<String> commands;

    public WorldEvent(Material itemIcon, String id, String translationId, List<String> commands) {
        this.id = id;
        this.itemIcon = itemIcon;
        this.translationId = translationId;
        this.commands = commands;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
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