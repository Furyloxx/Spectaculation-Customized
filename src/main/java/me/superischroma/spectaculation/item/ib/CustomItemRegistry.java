package me.superischroma.spectaculation.item.ib;

import java.util.HashMap;
import java.util.Map;

import me.superischroma.spectaculation.item.hoe.vanilla.DiamondHoe;

public class CustomItemRegistry {
    private static Map<Integer, DiamondHoe> customItems = new HashMap<>();

    public static void registerCustomItem(DiamondHoe customItem) {
        customItems.put(customItem.getId(), customItem);
    }

    public static DiamondHoe getCustomItem(int id) {
        return customItems.get(id);
    }

    public static boolean isCustomItem(int id) {
        return customItems.containsKey(id);
    }
}
