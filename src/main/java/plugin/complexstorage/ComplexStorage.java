package plugin.complexstorage;

import org.bukkit.plugin.java.JavaPlugin;
import plugin.complexstorage.commands.StorageCommand;
import plugin.complexstorage.items.StorageWrench;

public final class ComplexStorage extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        StorageWrench.init();
        getCommand("storage").setExecutor(new StorageCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
