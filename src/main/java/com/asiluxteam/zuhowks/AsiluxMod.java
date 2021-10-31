package com.asiluxteam.zuhowks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = AsiluxMod.MODID, name = AsiluxMod.NAME, version = AsiluxMod.VERSION)
public class AsiluxMod {
    public static final String MODID = "asilux";
    public static final String NAME = "Asilux Mod: Better Armor";
    public static final String VERSION = "2.0.0";
    public static final String MC_VERSION = "[1.12.2]";

    @Mod.Instance(AsiluxMod.MODID)
    public static AsiluxMod instance;

    @SidedProxy(clientSide = "com.asiluxteam.zuhowks.client.ClientProxy", serverSide = "com.asiluxteam.zuhowks.server.ServerProxy")
    public static CommonProxy commonProxy;

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
