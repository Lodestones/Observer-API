package gg.lode.observerapi.api.data;

import org.bukkit.Location;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public record Capsule(UUID uniqueId, Location location, @Nullable String teamId) {

}