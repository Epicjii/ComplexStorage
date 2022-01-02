package plugin.complexstorage.items;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import plugin.complexstorage.data.StorageController;

import java.util.ArrayList;
import java.util.List;

public class StorageWrench extends ItemStack implements Listener {
    public static ItemStack wrench;

    public static void init() {
        createWrench();
    }

    private static void createWrench() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text("Storage Wrench"));
        List<Component> lore = new ArrayList<>();
        lore.add(Component.text("Right Click a Crafting Table to get Started!"));
        meta.lore(lore);
        meta.addEnchant(Enchantment.MENDING, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        wrench = item;
    }

    @EventHandler
    public void setSystemController(PlayerInteractEvent event) {
        if (event.getPlayer().getInventory().getItemInMainHand().equals(wrench)) {
            if (event.getPlayer().isSneaking()) {
                Block clickedBlock = event.getClickedBlock();
                if (clickedBlock == null) {
                    return;
                }
                if (clickedBlock.getType().equals(Material.CRAFTING_TABLE)) {
                    new StorageController(clickedBlock);
                }
            }
        }
    }

    @EventHandler
    public static void setInventory(PlayerInteractEvent event) {
        if (event.getPlayer().getInventory().getItemInMainHand().equals(wrench)) {
            if (event.getPlayer().isSneaking()) {
                Block clickedBlock = event.getClickedBlock();
                if (clickedBlock == null) { return;}
                if (clickedBlock.getType().equals(Material.CHEST)) {
                    return;
                }
            }
        }
    }

}
