package plugin.complexstorage;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class StorageWrench extends ItemStack implements Listener {
    private Material type;
    private int amount;
    private ItemMeta meta;

    public StorageWrench() {
        type = Material.STICK;
        amount = 1;
    }

    @EventHandler
    public void onRightClick() {

    }


}
