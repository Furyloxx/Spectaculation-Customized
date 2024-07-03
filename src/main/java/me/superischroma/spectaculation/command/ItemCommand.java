package me.superischroma.spectaculation.command;

import me.superischroma.spectaculation.item.SItem;
import me.superischroma.spectaculation.item.SMaterial;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

@CommandParameters(description = "Gives an item from Spec.", aliases = "sitem,specitem", permission = "spt.item")
public class ItemCommand extends SCommand
{
    @Override
    public void run(CommandSource sender, String[] args)
    {
        if (args.length < 1 || args.length > 3) throw new CommandArgumentException();
        if (sender instanceof ConsoleCommandSender) throw new CommandFailException("Console senders cannot use this command!");
        Player player = sender.getPlayer();
        SMaterial material = SMaterial.getMaterial(args[0]);
        if (material == null) throw new CommandFailException("Invalid material.");
        
        int amount = 1; // Default amount
        if (args.length >= 2) {
            try {
                amount = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new CommandFailException("Invalid amount.");
            }
        }
        
        byte variant = 0; // Default variant
        if (args.length == 3) {
            try {
                variant = Byte.parseByte(args[2]);
            } catch (NumberFormatException e) {
                throw new CommandFailException("Invalid variant.");
            }
        }

        PlayerInventory inv = player.getInventory();
        if (inv.firstEmpty() == -1) throw new CommandFailException("No inventory space.");
        
        // Add the items to the inventory
        for (int i = 0; i < amount; i++) {
            if (inv.firstEmpty() == -1) {
                throw new CommandFailException("Not enough inventory space for all items.");
            }
            inv.setItem(inv.firstEmpty(), SItem.of(material, variant).getStack());
        }
        
        send("You have received " + amount + " " + material.getDisplayName(variant) + "(s).");
    }
}
