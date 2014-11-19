package com.connorlinfoot.customplayercount.Commands;

import com.connorlinfoot.customplayercount.CustomPlayerCount;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CPCCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.AQUA + "\"" + CustomPlayerCount.getPlugin().getDescription().getName() + "\" - Version: " + CustomPlayerCount.getPlugin().getDescription().getVersion());
        return true;
    }

}
