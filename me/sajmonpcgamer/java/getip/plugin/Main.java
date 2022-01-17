package me.sajmonpcgamer.java.getip.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import me.sajmonpcgamer.java.getip.plugin.events.onPlayerJoins;

public class Main extends JavaPlugin {
    private static Main instance;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        if(getConfig().getBoolean("eula") == true) {
            // Register Listeners
            getServer().getPluginManager().registerEvents(new onPlayerJoins(), this);

            getLogger().info("Ips in console will be shown, and you agree with eula!");
        } else if (getConfig().getBoolean("eula") == false) {
            getLogger().info("Please agree to eula!");
        } else {
            getLogger().info("Please agree to eula!");
        }

    }

    @Override
    public void onDisable() {
        instance = null;
        getLogger().info("Plugin Disabled!");
    }
}
