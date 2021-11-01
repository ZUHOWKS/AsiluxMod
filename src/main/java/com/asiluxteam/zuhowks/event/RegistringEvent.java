package com.asiluxteam.zuhowks.event;

import com.asiluxteam.zuhowks.init.ItemsInit;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegistringEvent {

    private ItemsInit itemsInit = ItemsInit.INSTANCE;

    @SubscribeEvent
    public void RegisterItems(RegistryEvent.Register<Item> event) {

        itemsInit.init();
        event.getRegistry().registerAll(itemsInit.getItems().toArray(new Item[0]));

    }
}
