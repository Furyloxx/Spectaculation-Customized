package me.superischroma.spectaculation.item.weapon;

import me.superischroma.spectaculation.item.*;

public class NecronHandle
implements MaterialStatistics,
MaterialFunction {
    @Override
    public String getDisplayName() {
        return "Necron's Handle";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ITEM;
    }
    
    @Override
    public boolean isEnchanted() {
        return true;
    }

    public boolean isStackable() {
        return false;
    }

    public long getValue() {
        return 200000000L;
    }

    public long getPrice() {
        return 200000000L;
    }
}