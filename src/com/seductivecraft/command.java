package com.seductivecraft;

import lib.PatPeter.SQLibrary.MySQL;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class command {
    private Command cmd;
    private String commandLabel;
    private String[] args;

    private MySQL db;

    private CommandSender sender;

    public command(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        this.setCmd(cmd);
        this.setCommandLabel(commandLabel);
        this.setArgs(args);
        this.setSender(sender);
    }

    public boolean run() {
        return false;
    }


    public MySQL getDb() {
        return db;
    }

    public void setDb(MySQL db) {
        this.db = db;
    }

    public CommandSender getSender() {
        return sender;
    }

    public void setSender(CommandSender sender) {
        this.sender = sender;
    }

    public Command getCmd() {
        return cmd;
    }

    public void setCmd(Command cmd) {
        this.cmd = cmd;
    }

    public String getCommandLabel() {
        return commandLabel;
    }

    public void setCommandLabel(String commandLabel) {
        this.commandLabel = commandLabel;
    }

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }
}
