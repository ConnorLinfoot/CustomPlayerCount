package com.connorlinfoot.customplayercount.Listeners;

import com.connorlinfoot.customplayercount.CustomPlayerCount;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class Ping implements Listener {

    @EventHandler
    public void onPing(ServerListPingEvent event) {
        int onlinePlayers = Bukkit.getOnlinePlayers().length;
        int maxPlayers = CustomPlayerCount.getPlugin().getConfig().getInt("Max Players");

        if (maxPlayers == -1) {
            maxPlayers = Bukkit.getMaxPlayers();
        } else if (maxPlayers == -2) {
            maxPlayers = onlinePlayers;
        }

        event.setMaxPlayers(maxPlayers);
        //event.setMotd(event.getMotd() + ChatColor.COLOR_CHAR + onlinePlayers + ChatColor.COLOR_CHAR + maxPlayers);
    }

}
