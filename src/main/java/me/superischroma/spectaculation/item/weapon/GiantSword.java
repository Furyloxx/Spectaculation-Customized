package me.superischroma.spectaculation.item.weapon;

import me.superischroma.spectaculation.item.*;

public class GiantSword
implements ToolStatistics,
MaterialFunction,
Ability {
    @Override
    public int getBaseDamage() {
        return 500;
    }

    @Override
    public String getDisplayName() {
        return "Giant's Sword";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.WEAPON;
    }

    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.SWORD;
    }

    @Override
    public String getLore() {
        return null;
    }

    @Override
    public String getAbilityName() {
        return "Giant's Slam";
    }

    @Override
    public String getAbilityDescription() {
        return "Slam your sword into the ground dealing " + ChatColor.RED + "100,000 " + ChatColor.GRAY + "damage to nearby enemies.";
    }