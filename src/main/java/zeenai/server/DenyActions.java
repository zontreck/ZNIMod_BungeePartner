package zeenai.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class DenyActions implements Listener
{
    @EventHandler
    public void DenyMovement(PlayerMoveEvent pme){
        pme.setCancelled(true);
        return;
    }
}