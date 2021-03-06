package com.mickdev.wm.init;

import com.mickdev.wm.werterbrosblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlock {
	public ModBlock(){
		init();
		registerBlocks();
		registerItemBlocks();
		if(FMLCommonHandler.instance().getSide().isClient())
		registerRenders();
	
	}
	
	
	public static Block orangeneon;
	public static Block sand_wet_stones;
	public static Block sw;
	public static Block sand_terracotta;
	public static Block sand_stones;
	public static Block d;
	public static Block sand_pinkorange;
	public static Block sand_red;
	public static Block sand_skeleton;
	private void init(){
		
		orangeneon = new Block(Material.IRON).setRegistryName("orangeneon").setUnlocalizedName("orangeneon").setHardness(2.0f).setResistance(1.5f).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		d= new Block(Material.SAND).setRegistryName("d").setUnlocalizedName("d").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sand_pinkorange= new Block(Material.SAND).setRegistryName("sand_pinkorange").setUnlocalizedName("sand_pinkorange").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sand_red= new Block(Material.SAND).setRegistryName("sand_red").setUnlocalizedName("sand_red").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sand_skeleton= new Block(Material.SAND).setRegistryName("sand_skeleton").setUnlocalizedName("sand_skeleton").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sand_stones= new Block(Material.SAND).setRegistryName("sand_stones").setUnlocalizedName("sand_stones").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sand_terracotta = new Block(Material.SAND).setRegistryName("sand_terracotta").setUnlocalizedName("sand_terracotta").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sw=new Block(Material.SAND).setRegistryName("sw").setUnlocalizedName("sw").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sand_wet_stones=new Block(Material.SAND).setRegistryName("sand_wet_stones").setUnlocalizedName("sand_wet_stones").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
	}
	private void registerBlocks(){
		registerBlock(orangeneon);
		registerBlock(sand_wet_stones);
		registerBlock(sw);
		registerBlock(d);
		registerBlock(sand_pinkorange);
		registerBlock(sand_red);
		registerBlock(sand_skeleton);
		registerBlock(sand_stones);
		registerBlock(sand_terracotta);
	}
	
	@SideOnly(Side.CLIENT)
	
	private void registerRenders(){
		
		 registerRender(orangeneon,0);
		 registerRender(d,0);
			registerRender(sand_pinkorange,0);
			registerRender(sand_red,0);
			registerRender(sand_skeleton,0);
			registerRender(sand_stones,0);
			registerRender(sand_terracotta,0);
			registerRender(sw,0);
			registerRender(sand_wet_stones,0);
			registerBlock(sand_wet_stones);
			registerBlock(sw);
			registerBlock(d);
			registerBlock(sand_pinkorange);
			registerBlock(sand_red);
			registerBlock(sand_skeleton);
			registerBlock(sand_stones);
			registerBlock(sand_terracotta);
		
	}
	private void registerItemBlocks(){
		registerItemBlock(orangeneon);
		registerItemBlock(d);
		registerItemBlock(sand_pinkorange);
		registerItemBlock(sand_red);
		registerItemBlock(sand_skeleton);
		registerItemBlock(sand_stones);
		registerItemBlock(sand_terracotta);
		registerItemBlock(sw);
		registerItemBlock(sand_wet_stones);
	}
	/**************************/
	private void registerBlock(Block block){
		GameRegistry.register(block);
	}
private void registerRender(Block block, int meta){
	Item item = Item.getItemFromBlock(block);
	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
	
}
private void registerItemBlock(Block block){
	ItemBlock ib = new ItemBlock(block);
    ib.setRegistryName(block.getRegistryName());
    GameRegistry.register(ib);
    
}
}

