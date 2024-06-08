package me.superischroma.spectaculation.item.oddities;

import me.superischroma.spectaculation.item.GenericItemType;
import me.superischroma.spectaculation.item.MaterialFunction;
import me.superischroma.spectaculation.item.MaterialStatistics;
import me.superischroma.spectaculation.item.Rarity;
import me.superischroma.spectaculation.item.SkullStatistics;

public class WardenHeart
implements MaterialStatistics,
MaterialFunction,
SkullStatistics
{
    @Override
    public String getDisplayName() {
        return "Warden Heart";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ITEM;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getURL() {
        return "19a3b5fab01dfabf1f8a814440a8ce80de109b135a51aef225c9ee98fe447e0";
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getLore() {
        return "The heart of a powerful creature, dropped by the Atoned Horror.";
    }
}