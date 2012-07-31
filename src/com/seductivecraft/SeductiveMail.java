package com.seductivecraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;
import lib.PatPeter.SQLibrary.*;

import java.util.ArrayList;


public class SeductiveMail extends JavaPlugin {

    private MySQL db;

    public void onEnable() {
        saveDefaultConfig();
        getLogger().info("com.seductivecraft.SeductiveMail has been enabled");
        new playerListener(this);
        initializeDatabase();

    }

    private void initializeDatabase() {
        FileConfiguration c = getConfig();
        String prefix = c.get("db.prefix").toString();
        String hostname = c.get("db.hostname").toString();
        String portnumb = c.get("db.portnumb").toString();
        String database = c.get("db.database").toString();
        String username = c.get("db.username").toString();
        String password = c.get("db.password").toString();
        this.db = new MySQL(getLogger(), prefix, hostname, portnumb, database, username, password);

    }

    public void onDisable() {
        getLogger().info("Your plugin has been disabled.");
        HandlerList.unregisterAll(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        command cmdHandler = null;
        String name = cmd.getName().toLowerCase();
        if (name.equals("mail")) {
            cmdHandler = new mailCommand(sender, cmd, commandLabel, args);
        }
        if(cmdHandler == null)
            return false;
        cmdHandler.setDb(this.db);
        return cmdHandler.run();
    }
}
