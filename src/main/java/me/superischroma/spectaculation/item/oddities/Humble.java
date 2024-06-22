package me.superischroma.spectaculation.item.oddities;

import me.superischroma.spectaculation.item.*;

public class QuiverArrow implements MaterialStatistics, MaterialFunction
{
    @Override
    public String getDisplayName()
    {
        return ChatColor.DARK_GRAY + "TheHumbleguy's Balls";
    }

    @Override
    public Rarity getRarity()
    {
        return Rarity.;
    }

    @Override
    public GenericItemType getType()
    {
        return GenericItemType.ITEM;
    }

    @Override
    public String getLore()
    {
        return "This item is in your inventory because you are holding your bow currently. Switch your held item to see the item that was here before.";
    }