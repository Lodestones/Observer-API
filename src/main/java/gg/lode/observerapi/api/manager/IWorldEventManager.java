package gg.lode.observerapi.api.manager;

import gg.lode.observerapi.api.data.WorldEvent;
import java.util.List;

public interface IWorldEventManager {
    List<WorldEvent> getWorldEvents();
    WorldEvent getWorldEvent(String id);
    void addWorldEvent(WorldEvent event);
    void removeWorldEvent(String id);
    void updateWorldEvent(WorldEvent event);
    void setCurrentWorldEvent(WorldEvent event);
    WorldEvent getCurrentWorldEvent();
} 