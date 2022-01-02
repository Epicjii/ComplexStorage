package plugin.complexstorage.data;

import org.bukkit.block.Block;
import org.bukkit.block.Chest;

import java.util.ArrayList;
import java.util.List;

public class StorageController {

    List<Chest> linkedStorage = new ArrayList<>();

    public StorageController(Block block) {
    }

    public void addLinkedStorage(Block block) {
        if (block instanceof Chest) {
            linkedStorage.add((Chest) block);
        }
    }
}
