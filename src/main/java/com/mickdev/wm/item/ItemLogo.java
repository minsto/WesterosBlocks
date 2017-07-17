package com.mickdev.wm.item;

import com.mickdev.wm.werterbrosblock;
import com.mickdev.wm.lib.Names;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemLogo extends Item{
	public ItemLogo() {
		setMaxStackSize(64);
	   
	    setCreativeTab(werterbrosblock.tabTutorial);
	}
	@Override
	  public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {

	    if (!world.isRemote)
	      player.sendMessage(new TextComponentString("You used my item!"));

	    return super.onItemRightClick(world, player, hand);
	  }

	  /**
	   * Returns the unlocalized the name for the item. Make sure to add a corresponding line to your localization file! You
	   * could probably just call {@link Item#setUnlocalizedName(String)} as well, but I usually just override this.
	   */
	  @Override
	  public String getUnlocalizedName(ItemStack stack) {

	    return "item." + werterbrosblock.RESOURCE_PREFIX + Names.LOGO_ITEM; 
	  }
}
