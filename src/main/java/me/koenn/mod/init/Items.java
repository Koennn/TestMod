package me.koenn.mod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import me.koenn.mod.item.ItemTest;
import me.koenn.mod.item.MagicWand;
import me.koenn.mod.reference.ItemReference;

public class Items {

    public static final ItemTest MAGIC_WAND = new MagicWand();

    public static void init() {
        GameRegistry.registerItem(MAGIC_WAND, ItemReference.MAGIC_WAND_NAME);
    }
}
