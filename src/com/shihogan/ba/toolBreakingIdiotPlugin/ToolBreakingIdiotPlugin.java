package com.shihogan.ba.toolBreakingIdiotPlugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.HandlerList;


public class ToolBreakingIdiotPlugin extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(new IdiotBreaksToolListener(), this);
	}
	
	@Override
	public void onDisable()
	{
		HandlerList.unregisterAll(this);
	}
}