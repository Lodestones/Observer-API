package gg.lode.observerapi.api.data;

public class WorldEvent {
    private String id;
    private String translationId;

    public WorldEvent(String id, String translationId) {
        this.id = id;
        this.translationId = translationId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTranslationId() {
        return translationId;
    }

    public void setTranslationId(String translationId) {
        this.translationId = translationId;
    }

}