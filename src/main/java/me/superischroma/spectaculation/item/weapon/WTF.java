package me.superischroma.spectaculation.item.weapon;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WTF {
    public static ItemStack createCustomSword() {
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta swordMeta = sword.getItemMeta();

        swordMeta.setDisplayName("WTF SWORD");
        swordMeta.setLore(Arrays.asList("Fuck you ", "and your mum [not for you]"));
        swordMeta.addEnchant(Enchantment.DAMAGE_ALL, 1000000, true);
        swordMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        sword.setItemMeta(swordMeta);
        return sword;
    }
}
