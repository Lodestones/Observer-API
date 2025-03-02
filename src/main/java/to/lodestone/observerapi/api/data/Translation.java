package to.lodestone.observerapi.api.data;

import net.kyori.adventure.text.TextReplacementConfig;
import net.kyori.adventure.title.Title;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.intellij.lang.annotations.RegExp;
import org.jetbrains.annotations.Nullable;
import to.lodestone.bookshelfapi.api.util.MiniMessageUtil;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public record Translation(@Nullable String tellraw, @Nullable Title title, @Nullable SoundTranslation soundTranslation) {

    private static final HashMap<String, String> REPLACEMENTS = new HashMap<>();

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

    public Translation replaceAll(@RegExp String key, String value) {
        REPLACEMENTS.put(key, value);
        return this;
    }

    public void send(Player player, Object... args) {
        if (tellraw != null) {
            if (tellraw.startsWith("<center>")) {
                AtomicReference<String> modifiedTellraw = new AtomicReference<>(tellraw.substring(8));
                REPLACEMENTS.forEach((key, value) -> modifiedTellraw.set(modifiedTellraw.get().replace(key, value)));
                MiniMessageUtil.center(modifiedTellraw.get(), args).forEach(player::sendMessage);
            } else {
                AtomicReference<String> modifiedTellraw = new AtomicReference<>(tellraw);
                REPLACEMENTS.forEach((key, value) -> modifiedTellraw.set(modifiedTellraw.get().replace(key, value)));
                player.sendMessage(MiniMessageUtil.deserialize(modifiedTellraw.get(), args));
            }
        }

        if (title != null) {
            AtomicReference<Title> modifiedTitle = new AtomicReference<>(title);
            REPLACEMENTS.forEach((@RegExp var key, var value) -> modifiedTitle.set(Title.title(
                    modifiedTitle.get().title().replaceText(TextReplacementConfig.builder().match(key).replacement(value).build()),
                    modifiedTitle.get().subtitle().replaceText(TextReplacementConfig.builder().match(key).replacement(value).build()),
                    modifiedTitle.get().times()
            )));
            player.showTitle(title);
        }

        if (soundTranslation != null) {
            player.playSound(player.getLocation(), soundTranslation.sound(), soundTranslation.soundCategory(), soundTranslation.volume(), soundTranslation.pitch());
        }
    }
}