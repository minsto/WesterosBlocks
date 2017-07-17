package com.mickdev.wm.init;


import com.mickdev.wm.werterbrosblock;
import com.mickdev.wm.block.Sandstoneornate;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SandstoneBlock {
	public SandstoneBlock(){
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
	public static Block stone_cobblenorthern;
	public static Block stone_cobblenorthernicy;
	public static Block stone_light;
	public static Block brick_lannisport;
	public static Block brick_reachlightpink;
	public static Block brick_reachpink;
	public static Block brick_reachlight;
	public static Block brick_stormlandslarge;
	public static Block brick_stormlandssmall;
	public static Block stone_cobblereachpink;
	public static Block brick_winterfellgranite;
	public static Block stone_cobblestormlands;
	public static Block stone_cobblestormlandsdark;
	public static Block brick_darkred;
	public static Block brick_nether;
	public static Block brick_orangesmallside;
	public static Block keystone_grey;
	public static Block keystone_netherbrick;
	public static Block marble_ornate;
	public static Block sandstone_brickslarge;
	public static Block sandstone_browndark;
	public static Block sandstone_ornate;
	public static Block sandstone_monochrome;
	public static Block sandstone_terracottadull;
	public static Block sandstone_monochrome0;
	public static Block sandstone_terracotta;
	public static Block sandstone_vividdark;
	public static Block sandstone_monochromedark;
	public static Block sandstone_vividmossy;
	public static Block sandstone_vivid;
	public static Block sandstone_terracottalightmossy;
	public static Block sandstone_terracottalight;
	public static Block sandstone_normaldarkmossy;
	public static Block sandstone_normaldark;
	public static Block sandstone_normal;
	public static Block sandstone_terracottaengraved;
	public static Block sandstone_red;
	private void init(){
		sandstone_brickslarge= new Block(Material.SAND).setRegistryName("sandstone_brickslarge").setUnlocalizedName("sandstone_brickslarge").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_browndark=new Block(Material.SAND).setRegistryName("sandstone_browndark").setUnlocalizedName("sandstone_browndark").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_ornate=new Sandstoneornate().setRegistryName("sandstone_ornate").setUnlocalizedName("sandstone_ornate");
		sandstone_monochrome=new Block(Material.SAND).setRegistryName("sandstone_monochrome").setUnlocalizedName("sandstone_monochrome").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_terracottadull=new Block(Material.SAND).setRegistryName("sandstone_terracottadull").setUnlocalizedName("sandstone_terracottadull").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_monochrome0=new Block(Material.SAND).setRegistryName("sandstone_monochrome0").setUnlocalizedName("sandstone_monochrome0").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_terracotta=new Block(Material.SAND).setRegistryName("sandstone_terracotta").setUnlocalizedName("sandstone_terracotta").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_vividdark=new Block(Material.SAND).setRegistryName("sandstone_vividdark").setUnlocalizedName("sandstone_vividdark").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_monochromedark=new Block(Material.SAND).setRegistryName("sandstone_monochromedark").setUnlocalizedName("sandstone_monochromedark").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_vividmossy=new Block(Material.SAND).setRegistryName("sandstone_vividmossy").setUnlocalizedName("sandstone_vividmossy").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_vivid=new Block(Material.SAND).setRegistryName("sandstone_vivid").setUnlocalizedName("sandstone_vivid").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_terracottalightmossy=new Block(Material.SAND).setRegistryName("sandstone_terracottalightmossy").setUnlocalizedName("sandstone_terracottalightmossy").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_terracottalight=new Block(Material.SAND).setRegistryName("sandstone_terracottalight").setUnlocalizedName("sandstone_terracottalight").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_normaldarkmossy=new Block(Material.SAND).setRegistryName("sandstone_normaldarkmossy").setUnlocalizedName("sandstone_normaldarkmossy").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_normaldark=new Block(Material.SAND).setRegistryName("sandstone_normaldark").setUnlocalizedName("sandstone_normaldark").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_normal=new Block(Material.SAND).setRegistryName("sandstone_normal").setUnlocalizedName("sandstone_normal").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_terracottaengraved=new Block(Material.PISTON).setRegistryName("sandstone_terracottaengraved").setUnlocalizedName("sandstone_terracottaengraved").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		sandstone_red=new Block(Material.SAND).setRegistryName("sandstone_red").setUnlocalizedName("sandstone_red").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		brick_lightgrey = new Block(Material.IRON).setRegistryName("brick_lightgrey").setUnlocalizedName("brick_lightgrey").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		brick_stonelargeu= new Block(Material.IRON).setRegistryName("brick_stonelargeu").setUnlocalizedName("brick_stonelargeu").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		stone_winterfellcarving= new Block(Material.IRON).setRegistryName("stone_winterfellcarving").setUnlocalizedName("stone_winterfellcarving").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		brick_stonesmall= new Block(Material.IRON).setRegistryName("brick_stonesmall").setUnlocalizedName("brick_stonesmall").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		bricks_stonesmallsmooth= new Block(Material.IRON).setRegistryName("bricks_stonesmallsmooth").setUnlocalizedName("bricks_stonesmallsmooth").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		stone_cobble= new Block(Material.IRON).setRegistryName("stone_cobble").setUnlocalizedName("stone_cobble").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		stone_cobbledark= new Block(Material.IRON).setRegistryName("stone_cobbledark").setUnlocalizedName("stone_cobbledark").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		bricks_whitesmall= new Block(Material.IRON).setRegistryName("bricks_whitesmall").setUnlocalizedName("bricks_whitesmall").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		stone_cobblenorthern=new Block(Material.IRON).setRegistryName("stone_cobblenorthern").setUnlocalizedName("stone_cobblenorthern").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		stone_cobblenorthernicy=new Block(Material.IRON).setRegistryName("stone_cobblenorthernicy").setUnlocalizedName("stone_cobblenorthernicy").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		stone_light=new Block(Material.IRON).setRegistryName("stone_light").setUnlocalizedName("stone_light").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		brick_lannisport=new Block(Material.IRON).setRegistryName("brick_lannisport").setUnlocalizedName("brick_lannisport").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		brick_reachlightpink=new Block(Material.IRON).setRegistryName("brick_reachlightpink").setUnlocalizedName("brick_reachlightpink").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		brick_reachpink=new Block(Material.IRON).setRegistryName("brick_reachpink").setUnlocalizedName("brick_reachpink").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		brick_reachlight=new Block(Material.IRON).setRegistryName("brick_reachlight").setUnlocalizedName("brick_reachlight").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		brick_stormlandslarge=new Block(Material.IRON).setRegistryName("brick_stormlandslarge").setUnlocalizedName("brick_stormlandslarge").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		brick_stormlandssmall=new Block(Material.IRON).setRegistryName("brick_stormlandssmall").setUnlocalizedName("brick_stormlandssmall").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		stone_cobblereachpink=new Block(Material.IRON).setRegistryName("stone_cobblereachpink").setUnlocalizedName("stone_cobblereachpink").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		brick_winterfellgranite=new Block(Material.IRON).setRegistryName("brick_winterfellgranite").setUnlocalizedName("brick_winterfellgranite").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		stone_cobblestormlands=new Block(Material.IRON).setRegistryName("stone_cobblestormlands").setUnlocalizedName("stone_cobblestormlands").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		stone_cobblestormlandsdark=new Block(Material.IRON).setRegistryName("stone_cobblestormlandsdark").setUnlocalizedName("stone_cobblestormlandsdark").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		brick_darkred=new Block(Material.IRON).setRegistryName("brick_darkred").setUnlocalizedName("brick_darkred").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		brick_nether=new Block(Material.IRON).setRegistryName("brick_nether").setUnlocalizedName("brick_nether").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		brick_orangesmallside=new Block(Material.IRON).setRegistryName("brick_orangesmallside").setUnlocalizedName("brick_orangesmallside").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		keystone_grey=new Block(Material.IRON).setRegistryName("keystone_grey").setUnlocalizedName("keystone_grey").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		keystone_netherbrick=new Block(Material.IRON).setRegistryName("keystone_netherbrick").setUnlocalizedName("keystone_netherbrick").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		marble_ornate=new Block(Material.IRON).setRegistryName("marble_ornate").setUnlocalizedName("marble_ornate").setHardness(2.0f).setResistance(1.5f).setCreativeTab(werterbrosblock.tabTutorial);
		
		
		
		
		
	}
	private void registerBlocks(){
		registerBlock(sandstone_brickslarge);
		registerBlock(sandstone_browndark);
		registerBlock(sandstone_ornate);
		registerBlock(sandstone_monochrome);
		registerBlock(sandstone_terracottadull);
		registerBlock(sandstone_monochrome0);
		registerBlock(sandstone_terracotta);
		registerBlock(sandstone_vividdark);
		registerBlock(sandstone_monochromedark);
		registerBlock(sandstone_vividmossy);
		registerBlock(sandstone_vivid);
		registerBlock(sandstone_terracottalightmossy);
		registerBlock(sandstone_terracottalight);
		registerBlock(sandstone_normaldarkmossy);
		registerBlock(sandstone_normaldark);
		registerBlock(sandstone_normal);
		registerBlock(sandstone_terracottaengraved);
		registerBlock(sandstone_red);
		registerBlock(brick_lightgrey);
		registerBlock(brick_stonelargeu);
		registerBlock(stone_winterfellcarving);
		registerBlock(brick_stonesmall);
		registerBlock(bricks_stonesmallsmooth);
		registerBlock(stone_cobble);
		registerBlock(stone_cobbledark);
		registerBlock(bricks_whitesmall);
		registerBlock(stone_cobblenorthern);
		registerBlock(stone_cobblenorthernicy);
		registerBlock(stone_light);
		registerBlock(brick_lannisport);
		registerBlock(brick_reachlightpink);
		registerBlock(brick_reachpink);
		registerBlock(brick_reachlight);
		registerBlock(brick_stormlandslarge);
		registerBlock(brick_stormlandssmall);
		registerBlock(stone_cobblereachpink);
		registerBlock(brick_winterfellgranite);
		registerBlock(stone_cobblestormlands);
		registerBlock(stone_cobblestormlandsdark);
		registerBlock(brick_darkred);
		registerBlock(brick_nether);
		registerBlock(brick_orangesmallside);
		registerBlock(keystone_grey);
		registerBlock(keystone_netherbrick);
		registerBlock(marble_ornate);
	}
@SideOnly(Side.CLIENT)
	private void registerRenders(){
		registerRender(sandstone_brickslarge,0);
		registerRender(sandstone_browndark,0);
		registerRender(sandstone_ornate,0);
		registerRender(sandstone_monochrome,0);
		registerRender(sandstone_terracottadull,0);
		registerRender(sandstone_monochrome0,0);
		registerRender(sandstone_terracotta,0);
		registerRender(sandstone_vividdark,0);
		registerRender(sandstone_monochromedark,0);
		registerRender(sandstone_vividmossy,0);
		registerRender(sandstone_vivid,0);
		registerRender(sandstone_terracottalightmossy,0);
		registerRender(sandstone_terracottalight,0);
		registerRender(sandstone_normaldarkmossy,0);
		registerRender(sandstone_normaldark,0);
		registerRender(sandstone_normal,0);
		registerRender(sandstone_terracottaengraved,0);
		registerRender(sandstone_red,0);
		registerRender(brick_lightgrey,0);
		registerRender(brick_stonelargeu,0);
		registerRender(stone_winterfellcarving,0);
		registerRender(brick_stonesmall,0);
		registerRender(bricks_stonesmallsmooth,0);
		registerRender(stone_cobble,0);
		registerRender(stone_cobbledark,0);
		registerRender(bricks_whitesmall,0);
		registerRender(stone_cobblenorthern,0);
		registerRender(stone_cobblenorthernicy,0);
		registerRender(stone_light,0);
		registerRender(brick_lannisport,0);
		registerRender(brick_reachlightpink,0);
		registerRender(brick_reachpink,0);
		registerRender(brick_reachlight,0);
		registerRender(brick_stormlandslarge,0);
		registerRender(brick_stormlandssmall,0);
		registerRender(stone_cobblereachpink,0);
		registerRender(brick_winterfellgranite,0);
		registerRender(stone_cobblestormlands,0);
		registerRender(stone_cobblestormlandsdark,0);
		registerRender(brick_darkred,0);
		registerRender(brick_nether,0);
		registerRender(brick_orangesmallside,0);
		registerRender(keystone_grey,0);
		registerRender(keystone_netherbrick,0);
		registerRender(marble_ornate,0);
	
	 }   
	private void registerItemBlocks(){
		registerItemBlock(sandstone_brickslarge);
		registerItemBlock(sandstone_browndark);
		registerItemBlock(sandstone_ornate);
		registerItemBlock(sandstone_monochrome);
		registerItemBlock(sandstone_terracottadull);
		registerItemBlock(sandstone_monochrome0);
		registerItemBlock(sandstone_terracotta);
		registerItemBlock(sandstone_vividdark);
		registerItemBlock(sandstone_monochromedark);
		registerItemBlock(sandstone_vividmossy);
		registerItemBlock(sandstone_vivid);
		registerItemBlock(sandstone_terracottalightmossy);
		registerItemBlock(sandstone_terracottalight);
		registerItemBlock(sandstone_normaldarkmossy);
		registerItemBlock(sandstone_normaldark);
		registerItemBlock(sandstone_normal);
		registerItemBlock(sandstone_terracottaengraved);
		registerItemBlock(sandstone_red);
		registerItemBlock(brick_lightgrey);
		registerItemBlock(brick_stonelargeu);
		registerItemBlock(stone_winterfellcarving);
		registerItemBlock(brick_stonesmall);
		registerItemBlock(bricks_stonesmallsmooth);
		registerItemBlock(stone_cobble);
		registerItemBlock(stone_cobbledark);
		registerItemBlock(bricks_whitesmall);
		registerItemBlock(stone_cobblenorthern);
		registerItemBlock(stone_cobblenorthernicy);
		registerItemBlock(stone_light);
		registerItemBlock(brick_lannisport);
		registerItemBlock(brick_reachlightpink);
		registerItemBlock(brick_reachpink);
		registerItemBlock(brick_reachlight);
		registerItemBlock(brick_stormlandslarge);
		registerItemBlock(brick_stormlandssmall);
		registerItemBlock(stone_cobblereachpink);
		registerItemBlock(brick_winterfellgranite);
		registerItemBlock(stone_cobblestormlands);
		registerItemBlock(stone_cobblestormlandsdark);
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
	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),meta,new ModelResourceLocation(new ResourceLocation(werterbrosblock.MOD_ID,block.getUnlocalizedName().substring(5)),"inventory"));
}
private void registerItemBlock(Block block){
	ItemBlock ib = new ItemBlock(block);
    ib.setRegistryName(block.getRegistryName());
    GameRegistry.register(ib);
	
}
/**
 * @return 
 * @return *********************/

}
