package plugin.complexstorage;

import org.bukkit.plugin.java.JavaPlugin;
import plugin.complexstorage.items.ItemManager;

public final class ComplexStorage extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ItemManager.init();
        getCommand("storage").setExecutor(new StorageCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
