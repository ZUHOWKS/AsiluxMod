package com.asiluxteam.zuhowks.items;

import com.asiluxteam.zuhowks.init.ItemsInit;
import net.minecraft.item.Item;

public class AsiluxItems extends Item {

    public AsiluxItems(String name) {
        setRegistryName(name).setUnlocalizedName(name);

        ItemsInit.INSTANCE.getItems().add(this);
    }
}
