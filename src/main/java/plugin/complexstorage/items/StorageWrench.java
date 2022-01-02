package plugin.complexstorage.items;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

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

}
