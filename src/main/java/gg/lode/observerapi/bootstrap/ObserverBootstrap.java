package gg.lode.observerapi.bootstrap;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Lifecycle contract that the runtime-loaded Observer implementation
 * fulfils. The public {@code Observer-Loader} jar is a JavaPlugin shim that
 * fetches the encrypted impl blob from lode.gg, decrypts it, instantiates the
 * entry class via a child-first classloader, and forwards Bukkit lifecycle
 * calls to it.
 *
 * <p>Implementations MUST have a public no-arg constructor so the loader can
 * instantiate them via reflection. The {@code host} passed to each method is
 * the loader's JavaPlugin instance — implementations use it for everything
 * that needs a real registered plugin (schedulers, event registration,
 * data folder, config).
 */
public interface ObserverBootstrap {
    void onLoad(JavaPlugin host);

    void onEnable(JavaPlugin host);

    void onDisable(JavaPlugin host);
}
