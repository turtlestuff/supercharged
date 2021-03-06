package com.turtlestuff.supercharged.client;

import com.turtlestuff.supercharged.init.ModBlocks;
import com.turtlestuff.supercharged.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = "supercharged", value = Side.CLIENT)
public class ClientEventHandler {
    public static void registerItemModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerItemModel(ModItems.protegent);
        registerItemModel(ModItems.deeta);
        registerItemModel(Item.getItemFromBlock(ModBlocks.testblock));
        registerItemModel(Item.getItemFromBlock(ModBlocks.vrabbers));
    }
}
