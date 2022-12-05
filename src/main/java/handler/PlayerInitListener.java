package handler;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerInitListener implements Listener {

    public static PlayerInitListener INSTANCE = new PlayerInitListener();

    private PlayerInitListener() {}

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("Hello, world");
    }
}
