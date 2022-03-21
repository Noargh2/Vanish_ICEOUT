package n0devx.vanish_iceout.listeners;

import n0devx.vanish_iceout.VanishManager;
import n0devx.vanish_iceout.Vanish_ICEOUT;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ConnectionListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        VanishManager manager = Vanish_ICEOUT.getInstace().getVanishManager();
        manager.hideAll(event.getPlayer());


    }
}
