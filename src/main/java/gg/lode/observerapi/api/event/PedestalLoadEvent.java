package gg.lode.observerapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.observerapi.api.data.pedestals.IPedestalHologram;

public class PedestalLoadEvent extends BaseEvent {

    private final String pedestalId;
    private final IPedestalHologram hologram;

    public PedestalLoadEvent(String pedestalId, IPedestalHologram hologram) {
        this.pedestalId = pedestalId;
        this.hologram = hologram;
    }

    public IPedestalHologram getHologram() {
        return hologram;
    }

    public String getPedestalId() {
        return pedestalId;
    }
}
