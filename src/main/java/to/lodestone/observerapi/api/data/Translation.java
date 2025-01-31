package to.lodestone.observerapi.api.data;

import net.kyori.adventure.title.Title;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;
import to.lodestone.bookshelfapi.api.util.MiniMessageUtil;

public record Translation(String tellraw, Title title, @Nullable SoundTranslation soundTranslation) {

    public void broadcast(Object... args) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            send(player, args);
        }
    }

    public void send(Player player, Object... args) {
        if (tellraw != null) {
            if (tellraw.startsWith("<center>")) {
                MiniMessageUtil.center(tellraw.substring(8), args).forEach(player::sendMessage);
            } else {
                player.sendMessage(MiniMessageUtil.deserialize(tellraw, args));
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