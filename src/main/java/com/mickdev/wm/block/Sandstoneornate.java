package com.mickdev.wm.block;

import com.mickdev.wm.werterbrosblock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Sandstoneornate extends Block{
	public Sandstoneornate() {
		// The Material determines some properties of the block.
	    super(Material.ROCK);
	    // The hardness determines how long a block takes to break. 5 is a bit high, most are around 2-3.
	    setHardness(5.0f);
	    // Resistance to explosions.
	    setResistance(10.0f);
	    // Sound type effects placing, breaking, and step sounds.
	    setSoundType(SoundType.STONE);
	    // This method can be used to set a specific tool type and harvest level. Remove if you don't need any restrictions.
	    setHarvestLevel("pickaxe", 1);

	    // If we don't set a creative tab, the block/item won't show up anywhere in the creative menus, but will still
	    // appear in JEI.
	    setCreativeTab(werterbrosblock.tabTutorial);
	}

}
