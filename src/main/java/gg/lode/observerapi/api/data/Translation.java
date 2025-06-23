package gg.lode.observerapi.api.data;

import gg.lode.bookshelfapi.api.util.MiniMessageUtil;
import net.kyori.adventure.title.Title;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.atomic.AtomicReference;

public record Translation(@Nullable String tellraw, @Nullable Title title,
                          @Nullable SoundTranslation soundTranslation) {

    public void broadcast(Object... args) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            send(player, args);
        }
    }

    public void broadcastExcept(Player except, Object... args) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (player != except) {
                send(player, args);
            }
        }
    }

    public void send(Player player, Object... args) {
        if (tellraw != null) {
            if (tellraw.startsWith("<center>")) {
                AtomicReference<String> modifiedTellraw = new AtomicReference<>(tellraw.substring(8));
                MiniMessageUtil.center(modifiedTellraw.get(), args).forEach(player::sendMessage);
            } else {
                AtomicReference<String> modifiedTellraw = new AtomicReference<>(tellraw);
                player.sendMessage(MiniMessageUtil.deserialize(modifiedTellraw.get(), args));
            }
        }

        if (title != null) {
            player.showTitle(title);
        }

        if (soundTranslation != null) {
            player.playSound(player.getLocation(), soundTranslation.sound(), soundTranslation.soundCategory(), soundTranslation.volume(), soundTranslation.pitch());
        }
    }
}