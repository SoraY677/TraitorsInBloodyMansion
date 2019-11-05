package com.kotlins.traitorsinbloodymansion

import org.bukkit.plugin.java.JavaPlugin

class TraitorsInBloodyMansion : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Plugin enabled")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("plugin disabled")
    }
}
