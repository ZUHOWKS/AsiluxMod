package com.asiluxteam.zuhowks.client;

import com.asiluxteam.zuhowks.CommonProxy;
import com.asiluxteam.zuhowks.init.ItemsInit;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {

    private ItemsInit itemsInit = ItemsInit.INSTANCE;

    @Override
    public void preInit() {

        super.preInit();

        MinecraftForge.EVENT_BUS.register(itemsInit);
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }

}
