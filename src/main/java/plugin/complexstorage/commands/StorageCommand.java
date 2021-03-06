package plugin.complexstorage.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import plugin.complexstorage.items.StorageWrench;

public class StorageCommand implements CommandExecutor {
    @Override
    public boolean onCommand(
            @NotNull CommandSender sender,
            @NotNull Command command,
            @NotNull String label,
            @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("You need to be a Player!");
            return false;
        }
        ((Player) sender).getInventory().addItem(StorageWrench.wrench);
        return true;
    }
}
