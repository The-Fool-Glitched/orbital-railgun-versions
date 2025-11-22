package io.github.mishkis.orbital_railgun.item;

import io.github.mishkis.orbital_railgun.OrbitalRailgun;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class OrbitalRailgunItems {
    public static final OrbitalRailgunItem ORBITAL_RAILGUN = register(new OrbitalRailgunItem(), "orbital_railgun");

    public static OrbitalRailgunItem register(OrbitalRailgunItem item, String id) {
        Identifier itemID = new Identifier(OrbitalRailgun.MOD_ID, id);
        return (OrbitalRailgunItem) Registry.register(Registries.ITEM, itemID, item);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.addAfter(Items.CROSSBOW, ORBITAL_RAILGUN));
    }
}
