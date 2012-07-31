package com.seductivecraft;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created with IntelliJ IDEA.
 * User: Blood
 * Date: 7/30/12
 * Time: 11:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class mailCommand extends command {
    public mailCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        super(sender, cmd, commandLabel, args);
    }

    @Override
    public boolean run() {
        String[] args = this.getArgs();
        if (args.length == 0) {
            if (!(this.getSender() instanceof Player)) {
                this.getSender().sendMessage(ChatColor.RED + "You must be a player!");
                return false;
            }
            return this.checkMessages();
        }
        return super.run();    //To change body of overridden methods use File | Settings | File Templates.
    }

    private boolean checkMessages() {
        if( this.getSender().hasPermission("scmail.info"))
        {
            return true;
        }
        return false;
    }
}
