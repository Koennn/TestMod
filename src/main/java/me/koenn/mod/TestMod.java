package me.koenn.mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import me.koenn.mod.init.Items;
import me.koenn.mod.proxy.IProxy;
import me.koenn.mod.reference.GeneralReference;

@Mod(modid = GeneralReference.MOD_ID, name = GeneralReference.MOD_NAME, version = GeneralReference.VERSION)
public class TestMod {

    @Mod.Instance(GeneralReference.MOD_ID)
    public static TestMod instance;

    @SidedProxy(clientSide = "me.koenn.mod.proxy.ClientProxy", serverSide = "me.koenn.mod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        Items.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }
}