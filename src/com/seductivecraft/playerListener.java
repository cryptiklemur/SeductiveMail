package com.seductivecraft;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

/**
 * Created with IntelliJ IDEA.
 * User: Blood
 * Date: 7/30/12
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class playerListener implements Listener {
    public playerListener(SeductiveMail plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onPlayerLogin(PlayerLoginEvent event) {
        // Look for mail and alert the user of any new mail
    }
}
