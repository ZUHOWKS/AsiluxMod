package com.asiluxteam.zuhowks.init;

import com.asiluxteam.zuhowks.AsiluxMod;
import com.asiluxteam.zuhowks.items.AsiluxItems;
import com.google.common.collect.Lists;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.List;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = AsiluxMod.MODID)
public class ItemsInit {

    public static final ItemsInit INSTANCE = new ItemsInit();

    public static Item andanozium;
    public static Item titanium;
    public static Item enderium;
    public static Item asilux;
    public static Item tungsten;
    public static Item oranium;

    private List<Item> items;

    public void init() {

        items = Lists.newArrayList();

        andanozium = new AsiluxItems("andanozium");
        titanium = new AsiluxItems("titanium");
        enderium = new AsiluxItems("enderium");
        asilux = new AsiluxItems("asilux");
        tungsten = new AsiluxItems("tungsten");
        oranium = new AsiluxItems("oranium");
    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event) {
        for(Item item : items) {
            registerModel(item);
        }
    }

    public void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(AsiluxMod.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }

    public List<Item> getItems() {
        return items;
    }
}
