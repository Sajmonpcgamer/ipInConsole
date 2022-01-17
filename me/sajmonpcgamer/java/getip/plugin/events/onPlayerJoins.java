package me.sajmonpcgamer.java.getip.plugin.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onPlayerJoins implements Listener {
    @EventHandler
    public void onPlayerJoins(PlayerJoinEvent event) {
        Bukkit.getLogger().info("Name: " + event.getPlayer().getName() + ", with ip: " + event.getPlayer().getAddress().getHostName());
    }
}
