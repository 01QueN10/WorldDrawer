package qn.worlddrawer;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class WorldDrawer extends JavaPlugin {

	public final FileConfiguration CONFIG = getConfig();
	public final Logger LOGGER = Logger.getLogger("Minecraft");

	@Override
	public void onEnable() {
		info("Loading the plugin..");
		getServer().getPluginManager().registerEvents(new EventListener(), this);
		info("Loading configurations..");
		CONFIG.addDefault("BuilderTool", 348);
	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
	}

	public void info(String msg) {
		LOGGER.info(ChatColor.GREEN + "WorldDrawer: " + ChatColor.RESET + msg);
	}

	public void error(String msg) {
		LOGGER.info(ChatColor.RED + "WorldDrawer: " + ChatColor.RESET + msg);
	}
}
