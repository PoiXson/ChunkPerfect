package com.poixson.chunkperfect;

import java.util.concurrent.atomic.AtomicReference;

import org.bukkit.configuration.file.FileConfiguration;

import com.poixson.commonmc.tools.plugin.xJavaPlugin;


public class ChunkPerfectPlugin extends xJavaPlugin {
	public static final String LOG_PREFIX  = "[ChunkProtect] ";

	protected static final AtomicReference<ChunkPerfectPlugin> instance = new AtomicReference<ChunkPerfectPlugin>(null);

	@Override public int getSpigotPluginID() { return 108147; }
	@Override public int getBStatsID() {       return 17775;  }



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



}
