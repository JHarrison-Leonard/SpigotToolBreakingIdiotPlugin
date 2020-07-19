package com.shihogan.ba.toolBreakingIdiotPlugin;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemBreakEvent;

public class IdiotBreaksToolListener implements Listener
{
	@EventHandler (priority = EventPriority.HIGHEST)
	public void onIdiotBreaksTool(PlayerItemBreakEvent event)
	{
		Bukkit.broadcastMessage("Everyone laugh at ".concat(event.getPlayer().getDisplayName()).concat(", they just broke their ").concat(event.getBrokenItem().toString()));
	}
}
