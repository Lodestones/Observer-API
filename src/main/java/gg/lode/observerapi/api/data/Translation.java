package gg.lode.observerapi.api.data;

import gg.lode.bookshelfapi.api.util.MiniMessageHelper;
import gg.lode.bookshelfapi.api.util.VariableContext;
import net.kyori.adventure.title.Title;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public record Translation(@Nullable String tellraw, @Nullable Title title,
                          @Nullable SoundTranslation soundTranslation, List<String> commands) {

    public void broadcast() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            send(player);
        }

        for (String command : commands) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
        }
    }

    public void broadcastExcept(Player... except) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (Arrays.stream(except).noneMatch(a -> a == player)) {
                send(player);
            }
        }

        for (String command : commands) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
        }
    }

    public void send(Player player) {
        if (tellraw != null) {
            if (tellraw.startsWith("<center>")) {
                AtomicReference<String> modifiedTellraw = new AtomicReference<>(tellraw.substring(8));
                MiniMessageHelper.center(modifiedTellraw.get(), new VariableContext()).forEach(player::sendMessage);
            } else {
                AtomicReference<String> modifiedTellraw = new AtomicReference<>(tellraw);
                player.sendMessage(MiniMessageHelper.deserialize(modifiedTellraw.get()));
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