package n0devx.vanish_iceout;

import n0devx.vanish_iceout.Commands.VanishCommand;
import n0devx.vanish_iceout.listeners.ConnectionListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vanish_ICEOUT extends JavaPlugin {
    private static Vanish_ICEOUT instance;
    private VanishManager vanishManager;

    @Override
    public void onEnable() {
        instance = this;
        this.vanishManager = new VanishManager(this);

        Bukkit.getPluginManager().registerEvents(new ConnectionListener(), this);
        getCommand("vanish").setExecutor(new VanishCommand());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Vanish_ICEOUT getInstace() {
        return instance;
    }

    public VanishManager getVanishManager() {
        return vanishManager;
    }
}
