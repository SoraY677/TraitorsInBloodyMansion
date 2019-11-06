package com.kotlins.traitorsinbloodymansion

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.plugin.java.JavaPlugin

class TraitorsInBloodyMansion : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Plugin enabled")
        logger.info("ことりん難しそうだね")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("plugin disabled")
    }

    //コマンド処理のメソッドだよ
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        return true 
    }
}
