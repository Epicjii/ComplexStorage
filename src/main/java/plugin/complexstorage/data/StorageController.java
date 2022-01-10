package plugin.complexstorage.data;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.block.Container;
import org.bukkit.inventory.CraftingInventory;

import java.util.ArrayList;
import java.util.List;

public class StorageController {

    List<Container> linkedStorage = new ArrayList<>();
    List<CraftingInventory> linkedCrafters = new ArrayList<>();

    public StorageController(Block block) {
    }

    public void addLinkedStorage(Block block) {
        if (block instanceof Container) {
            linkedStorage.add((Container) block);
            Bukkit.broadcast(Component.text("Added StorageBlock: " + block));
        }
    }
    public void addLinkedCrafter(Block block) {
        if (block instanceof CraftingInventory) {
            linkedCrafters.add((CraftingInventory) block);
        }
    }
}
