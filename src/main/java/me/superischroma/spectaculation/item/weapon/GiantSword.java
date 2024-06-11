package me.superischroma.spectaculation.item.weapon;

import me.superischroma.spectaculation.item.*;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.scheduler.BukkitRunnable;

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

    @Override
    public void ability(int action, SkyblockPlayer sbPlayer) {
       if(action != INTERACT_RIGHT_CLICK) return;
        if(!sbPlayer.manaCheck(100, "Giant's Slam")) return;

        Player player = sbPlayer.getBukkitPlayer();

        Block block = player.getTargetBlock(null, 6);
        World world = block.getWorld();

        Location loc = block.getLocation().subtract(0, 1, 0);
        LivingEntity giant = (LivingEntity) world.spawnEntity(Utility.floor(loc), EntityType.GIANT);
        LivingEntity ride = (LivingEntity) world.spawnEntity(Utility.floor(loc), EntityType.ARMOR_STAND);

        ride.setMetadata("isNotSkyblockEntity", new FixedMetadataValue(SkyblockSandbox.getInstance(), true));
        ride.setInvisible(true);
        ride.setGravity(false);
        ride.setInvulnerable(true);
        ride.addPassenger(giant);

        giant.setMetadata("isNotSkyblockEntity", new FixedMetadataValue(SkyblockSandbox.getInstance(), true));
        giant.setCustomName("Dinnerbone");
        giant.setCustomNameVisible(false);
        giant.setGravity(false);
        giant.setInvulnerable(true);
        giant.setInvisible(true);

        Objects.requireNonNull(giant.getEquipment()).setItemInMainHand(create());
        new BukkitRunnable() {
            @Override
            public void run() {
                ride.setHealth(0);
                ride.remove();

                giant.remove();
                giant.setHealth(0);
            }
    }
}