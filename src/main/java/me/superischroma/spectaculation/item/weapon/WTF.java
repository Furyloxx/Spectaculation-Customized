package me.superischroma.spectaculation.item.weapon;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.Arrays;
import com.avaje.ebeaninternal.server.core.PersistRequest;
import com.avaje.ebeaninternal.server.core.RelationalQueryEngine;
import me.superischroma.spectaculation.item.*;

public class WTF implements ToolStatistics, MaterialFunction
    
{
    public static ItemStack getMinecraftItem() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD); // Change to your desired item
        ItemMeta meta = item.getItemMeta();
    
    public int getBaseDamage()
    {
        return 10000;
    }

    @Override
    public String getDisplayName()
    {
        return "WTF";
    }

    public Rarity getRarity()
    {
        return Rarity.EPIC;
    }

    @Override
    public GenericItemType getType()
    {
        return GenericItemType.WEAPON;
    }

    public SpecificItemType getSpecificItemType()
    {
        return SpecificItemType.SWORD;
    }

    @Override
    public String getLore()
    {
        return "Fuck Off Noob";
    }
  }
}
