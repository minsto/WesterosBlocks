package com.mickdev.wm;

import com.mickdev.wm.init.ModBlocks;
import com.mickdev.wm.init.ModItems;
import com.mickdev.wm.init.ModItems2;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * The client-side only version of the proxy. Anything that should be done only on the client should be called from
 * here.
 */
public class ClientProxy extends CommonProxy {

  @Override
  public void preInit(FMLPreInitializationEvent event) {

    super.preInit(event);
  }

  @Override
  public void init(FMLInitializationEvent event) {

    super.init(event);

    ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

    // Register block models
    // Register item models
    ModItems.initClient(mesher);
  }

  @Override
  public void postInit(FMLPostInitializationEvent event) {

    super.postInit(event);
  }
}
