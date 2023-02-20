package com.poixson.chunkperfect;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;

import com.poixson.commonmc.tools.plugin.xJavaPlugin;


public class ChunkPerfectPlugin extends xJavaPlugin {
	public static final Logger log = Logger.getLogger("Minecraft");
	public static final String LOG_PREFIX  = "[ChunkProtect] ";
	protected static final int SPIGOT_PLUGIN_ID = 0;
	protected static final int BSTATS_PLUGIN_ID = 17775;

	protected static final AtomicReference<ChunkPerfectPlugin> instance = new AtomicReference<ChunkPerfectPlugin>(null);



	public ChunkPerfectPlugin() {
		super(ChunkPerfectPlugin.class);
	}



	@Override
	public void onEnable() {
		super.onEnable();
	}

	@Override
	public void onDisable() {
		super.onDisable();
	}



	// -------------------------------------------------------------------------------
	// configs



	@Override
	protected void loadConfigs() {
		this.mkPluginDir();
		// config.yml
		{
			final FileConfiguration cfg = this.getConfig();
			this.config.set(cfg);
			this.configDefaults(cfg);
			cfg.options().copyDefaults(true);
			super.saveConfig();
		}
	}
	@Override
	protected void saveConfigs() {
		// config.yml
		super.saveConfig();
	}
	@Override
	protected void configDefaults(final FileConfiguration cfg) {
		cfg.addDefault("Enable Chunk Loader",     Boolean.TRUE );
		cfg.addDefault("Enable Generate Blocker", Boolean.FALSE);
	}



	// -------------------------------------------------------------------------------



	@Override
	protected int getSpigotPluginID() {
		return SPIGOT_PLUGIN_ID;
	}
	@Override
	protected int getBStatsID() {
		return BSTATS_PLUGIN_ID;
	}



}
