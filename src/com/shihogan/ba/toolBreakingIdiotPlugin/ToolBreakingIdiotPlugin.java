package com.shihogan.ba.toolBreakingIdiotPlugin;
import org.bukkit.plugin.java.JavaPlugin;
import com.shihogan.ba.toolBreakingIdiotPlugin.IdiotBreaksToolListener;


public class ToolBreakingIdiotPlugin extends JavaPlugin
{
	// Ran when plugin enabled
	@Override
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(new IdiotBreaksToolListener(), this);
	}
	
	// Ran when plugin disabled
	@Override
	public void onDisable()
	{
		HandlerList.unregisterAll(this);
	}
}
