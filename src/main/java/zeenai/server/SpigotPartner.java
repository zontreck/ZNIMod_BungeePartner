package zeenai.server;

import org.bukkit.plugin.java.JavaPlugin;

public class SpigotPartner extends JavaPlugin
{
    @Override
    public void onEnable(){
        getLogger().info("Zontreck.Dev Enforced Authentication and Queue Management System (ZdEAQMS) Partner Plugin enabled!");
        getServer().getPluginManager().registerEvents(new DenyActions(), this);

    }
}