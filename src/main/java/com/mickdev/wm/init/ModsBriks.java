package com.mickdev.wm.init;

import com.mickdev.wm.References;
import com.mickdev.wm.werterbrosblock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModsBriks {
	public ModsBriks(){
		init();
		registerBlocks();
		registerItemBlocks();
		if(FMLCommonHandler.instance().getSide().isClient())
		registerRenders();
	}
	
	
	public static Block brick_lightgrey;
	public static Block brick_stonelargeu;
	public static Block stone_winterfellcarving;
	public static Block brick_stonesmall;
	public static Block bricks_stonesmallsmooth;
	public static Block stone_cobble;
	public static Block stone_cobbledark;
	public static Block bricks_whitesmall;
	public static Block brick_lannisport;
	public static Block brick_reachlightpink;
	public static Block brick_reachpink;
	public static Block brick_reachlight;
	public static Block brick_stormlandslarge;
	public static Block brick_stormlandssmall;
	public static Block brick_winterfellgranite;
	public static Block brick_darkred;
	public static Block brick_nether;
	public static Block brick_orangesmallside;
	public static Block keystone_grey;
	public static Block keystone_netherbrick;
	public static Block marble_ornate;
	private void init(){
		brick_lightgrey = new Block(Material.IRON).setRegistryName("brick_lightgrey").setUnlocalizedName("brick_lightgrey").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		brick_stonelargeu= new Block(Material.IRON).setRegistryName("brick_stonelargeu").setUnlocalizedName("brick_stonelargeu").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		stone_winterfellcarving= new Block(Material.IRON).setRegistryName("stone_winterfellcarving").setUnlocalizedName("stone_winterfellcarving").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		brick_stonesmall= new Block(Material.IRON).setRegistryName("brick_stonesmall").setUnlocalizedName("brick_stonesmall").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		bricks_stonesmallsmooth= new Block(Material.IRON).setRegistryName("bricks_stonesmallsmooth").setUnlocalizedName("bricks_stonesmallsmooth").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		stone_cobble= new Block(Material.IRON).setRegistryName("stone_cobble").setUnlocalizedName("stone_cobble").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		stone_cobbledark= new Block(Material.IRON).setRegistryName("stone_cobbledark").setUnlocalizedName("stone_cobbledark").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		bricks_whitesmall= new Block(Material.IRON).setRegistryName("bricks_whitesmall").setUnlocalizedName("bricks_whitesmall").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		brick_lannisport=new Block(Material.IRON).setRegistryName("brick_lannisport").setUnlocalizedName("brick_lannisport").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		brick_reachlightpink=new Block(Material.IRON).setRegistryName("brick_reachlightpink").setUnlocalizedName("brick_reachlightpink").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		brick_reachpink=new Block(Material.IRON).setRegistryName("brick_reachpink").setUnlocalizedName("brick_reachpink").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		brick_reachlight=new Block(Material.IRON).setRegistryName("brick_reachlight").setUnlocalizedName("brick_reachlight").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		brick_stormlandslarge=new Block(Material.IRON).setRegistryName("brick_stormlandslarge").setUnlocalizedName("brick_stormlandslarge").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		brick_stormlandssmall=new Block(Material.IRON).setRegistryName("brick_stormlandssmall").setUnlocalizedName("brick_stormlandssmall").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		brick_winterfellgranite=new Block(Material.IRON).setRegistryName("brick_winterfellgranite").setUnlocalizedName("brick_winterfellgranite").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		brick_darkred=new Block(Material.IRON).setRegistryName("brick_darkred").setUnlocalizedName("brick_darkred").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		brick_nether=new Block(Material.IRON).setRegistryName("brick_nether").setUnlocalizedName("brick_nether").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		brick_orangesmallside=new Block(Material.IRON).setRegistryName("brick_orangesmallside").setUnlocalizedName("brick_orangesmallside").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		keystone_grey=new Block(Material.IRON).setRegistryName("keystone_grey").setUnlocalizedName("keystone_grey").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		keystone_netherbrick=new Block(Material.IRON).setRegistryName("keystone_netherbrick").setUnlocalizedName("keystone_netherbrick").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		marble_ornate=new Block(Material.IRON).setRegistryName("marble_ornate").setUnlocalizedName("marble_ornate").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.Web);
		
		
		
		
		
	}
	private void registerBlocks(){
		registerBlock(brick_lightgrey);
		registerBlock(brick_stonelargeu);
		registerBlock(stone_winterfellcarving);
		registerBlock(brick_stonesmall);
		registerBlock(bricks_stonesmallsmooth);
		registerBlock(stone_cobble);
		registerBlock(stone_cobbledark);
		registerBlock(bricks_whitesmall);
		registerBlock(brick_lannisport);
		registerBlock(brick_reachlightpink);
		registerBlock(brick_reachpink);
		registerBlock(brick_reachlight);
		registerBlock(brick_stormlandslarge);
		registerBlock(brick_stormlandssmall);
		registerBlock(brick_winterfellgranite);
		registerBlock(brick_darkred);
		registerBlock(brick_nether);
		registerBlock(brick_orangesmallside);
		registerBlock(keystone_grey);
		registerBlock(keystone_netherbrick);
		registerBlock(marble_ornate);
		
		
		
		
		
		
		
		
		
		
	}
	 @SideOnly(Side.CLIENT)
	private void registerRenders(){
		registerRender(brick_lightgrey,0);
		registerRender(brick_stonelargeu,0);
		registerRender(stone_winterfellcarving,0);
		registerRender(brick_stonesmall,0);
		registerRender(bricks_stonesmallsmooth,0);
		registerRender(stone_cobble,0);
		registerRender(stone_cobbledark,0);
		registerRender(bricks_whitesmall,0);
		registerRender(brick_lannisport,0);
		registerRender(brick_reachlightpink,0);
		registerRender(brick_reachpink,0);
		registerRender(brick_reachlight,0);
		registerRender(brick_stormlandslarge,0);
		registerRender(brick_stormlandssmall,0);
		registerRender(brick_winterfellgranite,0);
		registerRender(brick_darkred,0);
		registerRender(brick_nether,0);
		registerRender(brick_orangesmallside,0);
		registerRender(keystone_grey,0);
		registerRender(keystone_netherbrick,0);
		registerRender(marble_ornate,0);
		
		
		
		
		
	}
	private void registerItemBlocks(){
		registerItemBlock(brick_lightgrey);
		registerItemBlock(brick_stonelargeu);
		registerItemBlock(stone_winterfellcarving);
		registerItemBlock(brick_stonesmall);
		registerItemBlock(bricks_stonesmallsmooth);
		registerItemBlock(stone_cobble);
		registerItemBlock(stone_cobbledark);
		registerItemBlock(bricks_whitesmall);
		registerItemBlock(brick_lannisport);
		registerItemBlock(brick_reachlightpink);
		registerItemBlock(brick_reachpink);
		registerItemBlock(brick_reachlight);
		registerItemBlock(brick_stormlandslarge);
		registerItemBlock(brick_stormlandssmall);
		registerItemBlock(brick_winterfellgranite);
		registerItemBlock(brick_darkred);
		registerItemBlock(brick_nether);
		registerItemBlock(brick_orangesmallside);
		registerItemBlock(keystone_grey);
		registerItemBlock(keystone_netherbrick);
		registerItemBlock(marble_ornate);
		
		
		
		
		
		
	}
	/**************************/
	private void registerBlock(Block block){
		GameRegistry.register(block);
	}
private void registerRender(Block block,int meta){
	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),meta,new ModelResourceLocation(new ResourceLocation(References.MODID,block.getUnlocalizedName().substring(5)),"inventory"));
}
private void registerItemBlock(Block block){
	ItemBlock ib = new ItemBlock(block);
    ib.setRegistryName(block.getRegistryName());
    GameRegistry.register(ib);
	
}
	
	
	
	
	
	
	

}
