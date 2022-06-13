package me.spengui.firstplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Plugin is a go, cap-in");

    }

   public boolean onCommand(CommandSender sender, Command command, String lable, String[] args) {

        //die kills player and yes i am following a youtube guide lmao
        if (command.getName().equalsIgnoreCase( "kill")){

            if (sender instanceof Player){

                Player p = (Player) sender;
                p.setHealth(0.0);
                p.sendMessage(ChatColor.RED + "You have been killed, get rekt");
            }

       }

        return true;
    }
}
