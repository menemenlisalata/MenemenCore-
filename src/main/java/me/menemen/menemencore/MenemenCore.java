package me.menemen.menemencore;

import org.bukkit.plugin.java.JavaPlugin;

public class MenemenCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("MenemenCore aktif!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MenemenCore kapatildi!");
    }
}
