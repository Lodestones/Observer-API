package gg.lode.observerapi.api.data;

import org.bukkit.SoundCategory;

public record SoundTranslation(String sound, float volume, float pitch, SoundCategory soundCategory) {
}